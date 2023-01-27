package com.adel.rushproducer.controller;

import com.adel.rushfactorycommon.model.Box;
import com.adel.rushproducer.service.FactoryProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/factory-producer")
public class FactoryProducerController {

    private final FactoryProducer factoryProducer;

    @PostMapping
    public void sendBox(@RequestBody Box box) throws ExecutionException, InterruptedException {
        log.info("Send to consumer ...");
        factoryProducer.sendToOtherFactory(box);
    }

}
