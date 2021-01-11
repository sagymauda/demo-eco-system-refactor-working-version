package com.example.MsReciveUserInfo.rabbit.configuation;


import com.example.MsReciveUserInfo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendUser {
    @Autowired
     RabbitTemplate rabbitTemplate;

    public SendUser(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void SendUserToMsListener(User user){
        log.info("sending {}", user);
        rabbitTemplate.convertAndSend(ConfigRabbit.USER_EXCHANGE, ConfigRabbit.ROUTING_KEY , user);
    }
}
