package ru.example.context;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.example.context.service.SimpleService;

@SpringBootApplication
public class ContextApplication implements ApplicationRunner {


    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {

        System.out.println(new SimpleService().toUpperString("test"));
    }
}

