package com.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GF
 * @since 2023/5/9
 */
public class LogbackTest {

    public static Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);


    @Test
    public void test01() throws InterruptedException {

//        for (int i = 0; i < 10000; i++) {

            LOGGER.error("info");
            LOGGER.warn("info");
            LOGGER.info("info");
            LOGGER.debug("info");
            LOGGER.trace("info");

//            LOGGER.info("{}", i);
//
//            if (i % 1000 == 0) {
//                Thread.sleep(500);
//            }
//        }
    }


}
