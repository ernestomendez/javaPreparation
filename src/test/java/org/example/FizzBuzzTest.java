package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzChange() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> result = fizzBuzz.fizzBuzzChange(0);

        assertTrue(result.isEmpty());
    }

    @Test
    public void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> result = fizzBuzz.fizzBuzzChange(20);

        List<String> expected = Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7",
                "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz");

        assertEquals(expected, result);
    }
}