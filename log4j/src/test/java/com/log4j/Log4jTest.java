package com.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author GF
 * @since 2023/5/6
 */
public class Log4jTest {

    @Test
    public void test01() throws InterruptedException {
//        BasicConfigurator.configure();

        //开启log4j内部日志
        LogLog.setInternalDebugging(true);

        Logger logger = Logger.getLogger(Log4jTest.class.getName());

        logger.fatal("record something");
        logger.error("record something");
        logger.warn("record something");
        logger.info("record something");
        logger.debug("record something");
//        Thread.sleep(2000);
        logger.trace("record something");
    }


    public static AtomicLong COUNTER = new AtomicLong(0);

    @Test
    public void test02() {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        for (int i = 0; i < 10000; i++) {
            logger.info(COUNTER.getAndIncrement());
        }
    }

    @Test
    public void test03() throws InterruptedException {
        Logger logger = Logger.getLogger(Log4jTest.class.getName());
        for (int i = 0; i < 10; i++) {
            logger.info("msg");
        }
    }

}
