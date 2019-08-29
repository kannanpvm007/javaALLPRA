package com.kgisl.qs1;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

/**
 * Assume
 */
public class Assume {

    @Test
    public void str1Test(){
        System.setProperty("sasi","shiens");
        assumeTrue("sasi".equals(System.getProperty("shiens")));
        System.out.println("getProperty");
    }
    @Test
    public void str2Test(){
        System.setProperty("sathya", "raj");
        assumeFalse("sathya".equals(System.getProperty("raj")));
    }
}