package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrailingZeroesFactorialTest {

    @Test
    public void trailingZeroesInFactorial() {
        TrailingZeroesFactorial trailingZeroesFactorial = new TrailingZeroesFactorial();

        int r = trailingZeroesFactorial.trailingZeroesInFactorial(625);

        assertEquals(156, r);
    }
}