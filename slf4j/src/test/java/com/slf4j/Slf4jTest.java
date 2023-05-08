package com.slf4j;

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
        LOGGER.error("info");
        LOGGER.warn("info");
        LOGGER.info("info");
        LOGGER.debug("info");
        LOGGER.trace("info");
    }
}
