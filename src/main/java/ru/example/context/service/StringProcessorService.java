package ru.example.context.service;

import org.springframework.stereotype.Service;

@Service
public class StringProcessorService {

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
