package br.com.throchadev.springlocalstack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SqsConsumer {

    @SqsListener("${cloud.aws.queue.name}")
    public void receiveMessage(Message message) {
        log.info("Message from SQS: {}", message.getMessage());
    }
}
