package com.adel.rushproducer;

import com.adel.rushfactorycommon.model.Box;
import com.adel.rushproducer.service.FactoryProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class InitRushProducer implements CommandLineRunner {

    private final FactoryProducer factoryProducer;

    @Override
    public void run(String... args) throws Exception {
        final Box box = new Box(1L, "adel","test");
        factoryProducer.sendToOtherFactory(box);
    }
}
