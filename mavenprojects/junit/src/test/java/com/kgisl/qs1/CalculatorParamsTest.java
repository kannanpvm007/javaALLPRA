package com.kgisl.qs1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * CalculatorTest
 */
@RunWith(Parameterized.class)
public class CalculatorParamsTest {
    public static void main(String[] args) {

    }

    private int fn;
    private int sn;

    Calculator c = new Calculator();

    public CalculatorParamsTest(int fn, int sn) {
        this.fn = fn;
        this.sn = sn;
    }

    @Parameters
    public static Collection input() {

        return Arrays.asList(new Object[][] { { 40, 20 }, { 30, 10 } });
    }

    @Before
    public void Before() {
        System.out.println("Before");
    }

    @Test
    public void addTest() {
        int actual = c.add(fn, sn);
        int expected = fn + sn;
        assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    public void subTest() {
        int actual = c.sub(fn, sn);
        int expected = fn - sn;
        assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    public void mulTest() {
        int actual = c.mul(fn, sn);
        int expected = fn * sn;
        assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    public void divTest() {
        System.out.println(fn);
        System.out.println(sn);
        int actual = c.div(fn, sn);
        int expected = fn / sn;
        assertEquals(expected, actual);
        // int actual = c.div(fn, sn);
        // int expected = fn/sn;
        // assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    public void modTest() {
        int actual = c.mod(fn, sn);
        int expected = fn % sn;
        assertEquals(expected, actual);
        System.out.println(expected);
    }

}
