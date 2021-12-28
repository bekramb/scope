package ru.example.scope.service;

import org.springframework.stereotype.Service;

@Service
public class StringProcessor {

    public String process(String str) {
        return str.toUpperCase();
    }
}
