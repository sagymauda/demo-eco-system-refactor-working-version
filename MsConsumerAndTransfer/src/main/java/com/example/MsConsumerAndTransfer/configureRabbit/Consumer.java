package com.example.MsConsumerAndTransfer.configureRabbit;

import com.example.MsConsumerAndTransfer.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class Consumer {

    private RestTemplate restTemplate = new RestTemplate();

    @RabbitListener(queues ={ConfigureRabbit.USER_QUEUE} )
    public void getUser(User user){
        log.info("received {}, transferring...", user);
        String fooResourceUrl = "http://ms-save-user:8083/user/create";
        HttpEntity<User> request = new HttpEntity<>(user);
        User createdUser = restTemplate.postForObject(fooResourceUrl, request, User.class);
        log.info("created {}", createdUser);
    }

}
