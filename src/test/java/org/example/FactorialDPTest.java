package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialDPTest {

    @Test
    public void factorial() {

        FactorialDP factorialDP = new FactorialDP();

        int factorial = factorialDP.factorial(8);

        assertEquals(40320, factorial);
    }

    @Test
    public void factorial2() {

        FactorialDP factorialDP = new FactorialDP();

        int factorial = factorialDP.factorial2(8);

        assertEquals(40320, factorial);

    }
}