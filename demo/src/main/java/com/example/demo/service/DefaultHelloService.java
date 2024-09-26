package com.example.demo.service;

import com.example.demo.persistance.Database;
import org.springframework.stereotype.Service;

@Service
public class DefaultHelloService implements HelloService {
    private final Database database;

    public DefaultHelloService(Database database) {
        this.database = database;
    }

    @Override
    public String getGreeting() {
        return database.getGreeting();
    }
}
