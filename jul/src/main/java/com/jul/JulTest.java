package com.jul;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

/**
 * @author GF
 * @since 2023/5/4
 */
public class JulTest {

    @Test
    public void test01() {
        Logger logger = Logger.getLogger(JulTest.class.getName());
        logger.info("jul logger test");
        logger.log(Level.INFO, "占位符 {0} - {1}", new Object[] {1, 2});
    }

    @Test
    public void test02() {
        Logger logger = Logger.getLogger(JulTest.class.getName());
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info"); //默认级别
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    @Test
    public void test03() throws IOException {
        Logger logger = Logger.getLogger(JulTest.class.getName());
        logger.setUseParentHandlers(false);

        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //控制台
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        //文件
        FileHandler fileHandler = new FileHandler("/Users/renascence/Idea2023/log-all/jul/src/test/file.log", true);
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info"); //默认级别
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");

    }

    /**
     * Logger父子对象关系
     */
    @Test
    public void test04() {
        Logger logger = Logger.getLogger("com.jul");
        Logger logger2 = Logger.getLogger("com");
        System.out.println(logger.getParent() == logger2);
        System.out.println(logger2.getParent().toString());
    }

    @Test
    public void test05() throws IOException {
        InputStream in = JulTest.class.getClassLoader().getResourceAsStream("logging.properties");

//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//
//        int b;
//        while ((b = in.read()) != -1) {
//            bos.write(b);
//        }
//
//        System.out.println(bos.toString());



        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(in);

        Logger logger = Logger.getLogger(JulTest.class.getName());
        logger.severe("severe严重");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

}
