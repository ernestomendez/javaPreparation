package org.example;

/**
 * <a href="https://leetcode.com/problems/factorial-trailing-zeroes/submissions/894483185/">Factorial trailing zeroes</a>
 * <p>
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 0
 * Output: 0
 */

public class TrailingZeroesFactorial {

    public int trailingZeroesInFactorial(int n) {
        int sum = 0;

        if (n < 5) {
            return sum;
        }

        do {
            n = n / 5;
            sum += n;
        } while (n >= 5);

        return sum;

    }
}
