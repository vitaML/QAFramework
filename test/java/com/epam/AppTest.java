package com.epam;


import com.epam.base.Log;
import org.slf4j.Logger;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private static final Logger log = new Log(AppTest.class).getLogger();
    @Test
    public void testMethod() {
        log.info("info");
        System.out.println("Hello, World!");
    }
}
