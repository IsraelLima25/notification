package br.com.lima.notification.listener;

import br.com.lima.notification.custom.StrConsumerCustomListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class StrConsumerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(StrConsumerListener.class);

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        LOGGER.info("CREATE ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        LOGGER.info("LOG ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2", containerFactory = "validMessageContainerFactory")
    public void history(String message){
        LOGGER.info("HISTORY ::: Receive message {}", message);
    }
}
