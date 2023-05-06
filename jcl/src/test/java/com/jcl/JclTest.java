package com.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @author GF
 * @since 2023/5/6
 */
public class JclTest {

    @Test
    public void test01() {
        Log log = LogFactory.getLog(JclTest.class.getName());
        log.info("test mes");
    }

}
