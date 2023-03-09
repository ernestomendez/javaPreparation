package org.example;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/">reverse words</a>
 *
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Example 2:
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Example 3:
 *
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWords {

    public String reverseWords(String s) {
        String[] split = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = split.length - 1;  i >= 0; i--) {

            if (split[i].equals("")) {
                continue;
            }

            if (i == split.length - 1) {
                sb.append(split[i]);
            } else {
                sb.append(" ");
                sb.append(split[i]);
            }
        }

        return sb.toString();
    }

    public String reverseWordsString(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int i = s.length() -1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {

            if (s.charAt(i) != ' ') {
                int j = sb.length();

                if (sb.length() > 0) {
                    sb.append(' ');
                    j= sb.length();
                }

                while (i >= 0 && s.charAt(i) != ' ') {

                    sb.insert(j, s.charAt(i));
                    i--;
                }
            }
            i--;
        }

        return sb.toString();
    }
}
