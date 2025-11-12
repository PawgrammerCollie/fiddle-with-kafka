package it.codercollie.fiddlewithkafka.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    @KafkaListener(topics = "codercollie", groupId = "${spring.kafka.consumer.group-id}")
    public void onMessage(String payload){
        logger.info("\uD83D\uDFE2 Consumed: {}", payload);
    }
}
