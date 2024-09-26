package com.example.demo.persistance;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDatabase  implements Database {
    private final List<String> greetings;

    public InMemoryDatabase() {
        greetings = new ArrayList<>(List.of(
                "Hallo",
                "Hello",
                "Bonjour",
                "Ciao",
                "Hola"
        ));
    }

    @Override
    public String getGreeting() {
        int randomIndex = (int) (Math.random() * greetings.size());
        return greetings.get(randomIndex);
    }
}
