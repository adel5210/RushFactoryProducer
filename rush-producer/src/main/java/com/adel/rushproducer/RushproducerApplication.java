package com.adel.rushproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class RushproducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RushproducerApplication.class, args);
    }


}
