package com.adel.rushproducer.service;

import com.adel.rushfactorycommon.model.Box;
import com.adel.rushproducer.config.ParamsConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
@Slf4j
@RequiredArgsConstructor
public class FactoryProducer {

    private final KafkaTemplate<Long, Box> kafkaTemplate;
    private final ParamsConfig paramConfig;

    @Transactional
    public void sendToOtherFactory(Box box) throws ExecutionException, InterruptedException {
        log.info("Send to other factory ...");
        final CompletableFuture<SendResult<Long, Box>> resultCompletableFuture =
                kafkaTemplate.send(paramConfig.getTopic(), box);
//        resultCompletableFuture.get();
    }

}
