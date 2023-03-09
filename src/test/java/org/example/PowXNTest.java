package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowXNTest {

    @Test
    public void pow() {
        PowXN powXN = new PowXN();

        double pow = powXN.powRecursive(2, -3);

        assertEquals(0.125, pow, 0.0);
    }

    @Test
    public void pow2() {
        PowXN powXN = new PowXN();

        double pow = powXN.powRecursive(5, 9);

        assertEquals(1953125, pow, 0.0);
    }

    @Test
    public void powNegative() {
        PowXN powXN = new PowXN();

        double pow = powXN.pow(2, -3);

        assertEquals(0.125, pow, 0.0);
    }

    @Test
    public void powPositive() {
        PowXN powXN = new PowXN();

        double pow = powXN.pow(5, 9);

        assertEquals(1953125, pow, 0.0);
    }

}