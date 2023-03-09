package org.example;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s.length() > 2 ) {
            return palindromeLongString(s);
        } else if (s.length() == 1) {
            return s;
        } else {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            }
            return String.valueOf(s.charAt(0));
        }
    }

    private String palindromeLongString(String s) {
        int n = s.length();
        int maxLength = 1;
        int start = 0;
        int end = 0;

        boolean[][] table = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }

        for (int i = 0; i < n -1; i++) {
            if (s.charAt(i) == s.charAt(i +1)) {
                table[i][i+1] = true;
                maxLength = 2;
                start = i;
                end = i + 1;
            }
        }


        for (int len = 2; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                if (s.charAt(i) == s.charAt(j)) {
                    if (table[i + 1][j - 1]) {
                        table[i][j] = true;
                        if (len + 1 > maxLength) {
                            maxLength = len + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
