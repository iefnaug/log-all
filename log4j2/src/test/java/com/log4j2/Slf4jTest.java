package com.log4j2;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GF
 * @since 2023/5/8
 */
public class Slf4jTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void test01() {
        LOGGER.error("msg");
        LOGGER.warn("msg");
        LOGGER.info("msg");
        LOGGER.debug("msg");
        LOGGER.trace("msg");
    }
    
    
    @Test
    public void test02() throws InterruptedException {
        for (int i = 0; i < 2000; i++) {
            LOGGER.error("msg {}", i);
            LOGGER.warn("msg {}", i);
            LOGGER.info("msg {}", i);
            LOGGER.debug("msg {}", i);
            LOGGER.trace("msg {}", i);
            if (i % 1000 == 0) {
                Thread.sleep(300);
            }
        }
    }
}
