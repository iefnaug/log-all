package com.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author GF
 * @since 2023/5/11
 */
public class Log4j2Test {

    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);


    @Test
    public void test01() {
        LOGGER.fatal("msg");
        LOGGER.error("msg");
        LOGGER.warn("msg");
        LOGGER.info("msg");
        LOGGER.debug("msg");
        LOGGER.trace("msg");
    }

}
