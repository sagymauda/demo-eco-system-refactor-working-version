package com.example.MsSaveUserToDb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection ="user")
public class User {


    @Id
    private String id;
    private String name;
    private Integer age;
    private Integer height;
    String address;
    Date birthDate;



}
