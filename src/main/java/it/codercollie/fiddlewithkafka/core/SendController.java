package it.codercollie.fiddlewithkafka.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SendController {

    private final ProducerService producerService;

    public SendController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("send")
    public ResponseEntity<String> send(@RequestParam String message) {
        producerService.send(message);
        return ResponseEntity.ok("\uD83D\uDFE2 Sent: " + message);
    }
}
