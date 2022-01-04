package ru.example.context.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtility implements ApplicationContextAware {


    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringUtility.applicationContext = applicationContext;
    }

    /**
     * @param clazz bean class
     * @param <T> bean type
     * @return a class bean from the application context
     */
    public static <T> T getBean(final Class<T> clazz) {
        return SpringUtility.applicationContext.getBean(clazz);
    }
}