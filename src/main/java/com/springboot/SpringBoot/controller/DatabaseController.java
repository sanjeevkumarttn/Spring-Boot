package com.springboot.SpringBoot.controller;

import com.springboot.SpringBoot.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    Database database;

    @GetMapping("/app")
    public  Database getDatabase(){
        return database;
    }
}
