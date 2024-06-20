package br.com.lima.notification.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StrConsumerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(StrConsumerListener.class);

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
    public void listener(String message){
        LOGGER.info("Receive message {}", message);
    }
}
