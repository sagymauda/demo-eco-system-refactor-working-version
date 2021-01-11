package com.example.MsSaveUserToDb.controller;

import com.example.MsSaveUserToDb.entity.User;
import com.example.MsSaveUserToDb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user) {
        log.info("received {}", user);
       return userService.save(user);

    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllFisherman() {
        return userService.getAll();
    }
}
