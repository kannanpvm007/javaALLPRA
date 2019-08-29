package com.kgisl.qs1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;



/**
 * AssertTest
 */
public class AssertTest {
   
   @Test
    public void assertTest() {
        String str1 = new String("sasi");
        String str2 = new String("sasi");
        String str3 = new String("shiens");
        String str4 = null;
        String str5 = "gk";
        String str6 = "prabha";
        int val1 = 10;
        int val2 = 10;
        int val3 = 20;
        assertEquals(str1, str2);
        assertFalse(val1 > val3);
        assertNotSame(str1, str3);
        assertNotNull(val1);
        String[] expected={"sasi","shiens"};
        String[] actual={"sasi","shiens"};
        assertArrayEquals( expected, actual);
    }
}
     