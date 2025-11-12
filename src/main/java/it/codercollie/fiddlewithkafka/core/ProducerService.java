package it.codercollie.fiddlewithkafka.core;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String, String> template;

    public ProducerService(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void send(String message) {
        template.send("codercollie", message);
    }
}
