package com.example.MsReciveUserInfo.controller;

import com.example.MsReciveUserInfo.entity.User;
import com.example.MsReciveUserInfo.rabbit.configuation.SendUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/create")
public class UserController {

    @Autowired
    SendUser sendUser;


    @PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user){
        log.info("/user received {}", user);
        sendUser.SendUserToMsListener(user);
    }

}
