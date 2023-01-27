package com.adel.rushproducer.service;

import com.adel.rushproducer.model.Box;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FactoryProducer {

    private final KafkaTemplate<Long, Box> kafkaTemplate;

    @Transactional("kafkaTransactionManager")
    public void sendBoxes(boolean error){

    }

}
