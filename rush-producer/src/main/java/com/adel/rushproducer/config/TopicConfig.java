package com.adel.rushproducer.config;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.transaction.KafkaTransactionManager;

@Configuration
@RequiredArgsConstructor
public class TopicConfig {

    private final ParamsConfig paramConfig;

    @Bean
    public NewTopic topic1(){
        return TopicBuilder
                .name(paramConfig.getTopic())
                .partitions(1)
                .replicas(1)
                .build();
    }

}
