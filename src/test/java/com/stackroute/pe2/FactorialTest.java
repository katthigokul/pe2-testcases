package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    /* Test case to check the Factorial of int*/
    @Test
    public void intFactorial() {
        long number = 5L;
        long expResult = 120L;
        long result = Test2.factorial(number);
        //Asserts
        assertEquals(expResult, result);
    }

    /*Test case to check the LongFactorial*/

    @Test
    public void longFactorial() {
    //Asserts
        assertEquals(720, fact(6));
        assertEquals(1, fact(0));
        assertEquals(1, fact(1));
        assertEquals(121645100408832000L, fact(19));
        assertEquals(2432902008176640000L, fact(20));
    }

    }

/* Test cases if factorial value is Negative*/

    @Test

    public void factorialNegative() {
        math.factorial(-1);
    }



}