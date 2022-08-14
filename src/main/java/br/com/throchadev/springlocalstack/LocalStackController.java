package br.com.throchadev.springlocalstack;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalStackController {

    private final SqsPublisher sqsPublisher;

    public LocalStackController(SqsPublisher sqsPublisher) {
        this.sqsPublisher = sqsPublisher;
    }

    @PostMapping("/sendMessage")
    public ResponseEntity sendMessage(@RequestBody Message message) {
        sqsPublisher.sendMessage(message);
        return ResponseEntity.ok().build();
    }
}
