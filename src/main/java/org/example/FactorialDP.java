package org.example;

public class FactorialDP {

    public int factorial(int n) {
        if (n <2) {
            return 1;
        }

        int[] facts = new int[n+1];

        facts[0] = 1;

        for (int i = 1; i <= n; i++) {

            facts[i] = i * facts[i-1];
        }

        return facts[n];
    }

    public int factorial2(int n) {
        if (n < 2) {
            return 1;
        }

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
