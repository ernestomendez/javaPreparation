package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "abcbcbaa";

        String palindrome = longestPalindromicSubstring.longestPalindrome(s);

        assertEquals("abcbcba", palindrome);
    }

    @Test
    public void longestPalindromeOneChar() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "a";

        String palindrome = longestPalindromicSubstring.longestPalindrome(s);

        assertEquals("a", palindrome);
    }

    @Test
    public void longestPalindromeTwoChar() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "ab";

        String palindrome = longestPalindromicSubstring.longestPalindrome(s);

        assertEquals("a", palindrome);
    }

    @Test
    public void longestPalindrome1() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "uuanitalavalatinaaabbaaax";

        String palindrome = longestPalindromicSubstring.longestPalindrome(s);

        assertEquals("anitalavalatina", palindrome);
    }

}