package com.example.MsSaveUserToDb.service;

import com.example.MsSaveUserToDb.entity.User;
import com.example.MsSaveUserToDb.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public User save(User user){
        log.info("saving {}", user);
        return userRepo.save(user);
    }



    public List<User> getAll() {
        return  userRepo.findAll();
    }
}
