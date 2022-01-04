package ru.example.context;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.example.context.service.SimpleService;

@SpringBootTest
class ContextApplicationTest {

    @Test
    void shouldCheckBeanCall() {

        assertThat(new SimpleService().toUpperString("test")).isEqualTo("TEST");
    }
}
