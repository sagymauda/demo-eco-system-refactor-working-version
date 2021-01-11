package com.example.MsSaveUserToDb.repository;

import com.example.MsSaveUserToDb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {


}
