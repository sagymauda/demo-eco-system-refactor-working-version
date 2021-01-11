package com.example.MsConsumerAndTransfer.configureRabbit;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureRabbit {
    public static final String USER_QUEUE = "users";

    @Bean
    public Queue defaultParsingQueue(){
        return new Queue(USER_QUEUE);
    }

    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

}
