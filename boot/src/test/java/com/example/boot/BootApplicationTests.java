package com.example.boot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(BootApplicationTests.class);

    @Test
    void contextLoads() {
        LOGGER.info("msg");
    }

}
