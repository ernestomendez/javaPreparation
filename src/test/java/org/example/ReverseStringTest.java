package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {

        ReverseString reverseString = new ReverseString();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);


    }
}