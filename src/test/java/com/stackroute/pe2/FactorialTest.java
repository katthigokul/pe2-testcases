package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp() throws Exception {
        factorial=new Factorial();

    }

    @After
    public void tearDown() throws Exception {
        factorial=null;
    }

    /* Test case to check the Factorial of int*/
    @Test
    public void givenInputShouldRetunFactorial() {
        int number = 5;
        int expResult = 120;
        int result = factorial.checkFactorial(number);
        //Asserts
        assertEquals(expResult, result);
    }

    /*Test case to check the LongFactorial*/

    @Test
    public void longFactorial() {
    //Asserts
        assertEquals(720, factorial.fact(6));
        assertEquals(1,factorial.fact(0));
        assertEquals(1, factorial.fact(1));
        assertEquals(121645100408832000L, factorial.fact(19));
        assertEquals(2432902008176640000L, factorial.fact(20));
    }

    }

/* Test cases if factorial value is Negative*/

    @Test

    public void factorialNegative() {
        math.factorial(-1);
    }



}