package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void reverseWords() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWords("a good   example");

        assertEquals("example good a", s);
    }

    @Test
    public void reverseWords2() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWords("  a good   example  ");

        assertEquals("example good a", s);
    }

    @Test
    public void reverseWordsEmpty() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWords("   ");

        assertEquals("", s);
    }

    @Test
    public void reverseWordsSingleWord() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWords("hola");

        assertEquals("hola", s);
    }

    @Test
    public void reverseWordsString() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWordsString("a good   example");

        assertEquals("example good a", s);
    }

    @Test
    public void reverseWordsString2() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWordsString("  a good   example  ");

        assertEquals("example good a", s);
    }

    @Test
    public void reverseWordsStringEmpty() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWordsString("   ");

        assertEquals("", s);
    }

    @Test
    public void reverseWordsStringSingleWord() {

        ReverseWords reverseWords = new ReverseWords();

        String s = reverseWords.reverseWordsString("hola");

        assertEquals("hola", s);
    }
}