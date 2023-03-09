package org.example;

/**
 * <a href="https://leetcode.com/problems/powx-n/description/">pow</a>
 */
public class PowXN {

    /**
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     *
     *
     *
     * Example 1:
     *
     * Input: x = 2.00000, n = 10
     * Output: 1024.00000
     *
     * Example 2:
     *
     * Input: x = 2.10000, n = 3
     * Output: 9.26100
     *
     * Example 3:
     *
     * Input: x = 2.00000, n = -2
     * Output: 0.25000
     * Explanation: 2-2 = 1/22 = 1/4 = 0.25
     * @param x
     * @param power
     * @return
     */
    public double powRecursive(float x, int power) {
        if (power == 0) {
            return 1L;
        }

        double result = powRecursive(x, power / 2);

        if (power % 2 == 0) {
            return result * result;
        } else {
            if (power > 0) {
                return x * result * result;
            } else {
                return (result * result) / x;
            }
        }
    }

    public double pow(float x, int power) {
        double res = 1.0;
        long p = power;

        if (power < 0) {
            p = power * - 1;
        }

        while (p > 0) {
            if (p % 2 == 0) {
                x = x * x;
                p = p / 2;
            } else {
                res = res * x;
                p--;
            }
        }

        if (power < 0) {
            return 1 / res;
        }
        return res;

    }

}
