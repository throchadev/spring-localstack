package br.com.throchadev.springlocalstack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j

public class SqsPublisher {

    private final QueueMessagingTemplate queueMessagingTemplate;
    private final SqsConfiguration sqsConfiguration;

    public SqsPublisher(QueueMessagingTemplate queueMessagingTemplate, SqsConfiguration sqsConfiguration) {
        this.queueMessagingTemplate = queueMessagingTemplate;
        this.sqsConfiguration = sqsConfiguration;
    }

    public void sendMessage(Message message) {
        log.info("Sending Message to SQS ...");
        queueMessagingTemplate.convertAndSend(sqsConfiguration.getEndpoint(), message);
    }
}
