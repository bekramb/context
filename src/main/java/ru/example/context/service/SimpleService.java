package ru.example.context.service;

import ru.example.context.util.SpringUtility;

public class SimpleService {

    private static StringProcessorService stringProcessorService = SpringUtility.getBean(StringProcessorService.class);

    public String toUpperString(String str) {
        return stringProcessorService.toUpperCase(str);
    }
}
