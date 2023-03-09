package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumbersTest {

    @Test
    public void isPalindromePar() {

        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();

        assertTrue(palindromeNumbers.isPalindrome(1221));
    }

    @Test
    public void isPalindromeImpar() {

        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();

        assertTrue(palindromeNumbers.isPalindrome(12521));
    }

    @Test
    public void isPalindromeOneDigit() {

        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();

        assertTrue(palindromeNumbers.isPalindrome(0));
    }

    @Test
    public void isPalindromeFalse() {

        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();

        assertFalse(palindromeNumbers.isPalindrome(15150));
    }
}