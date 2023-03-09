package org.example;

public class ReverseString {

    public void reverseString(char[] s) {

        int end = s.length;
        int start = 0;

        if (end >= 1) {
            char tmp;
            end--;

            while (start < end) {
                tmp = s[end];
                s[end] = s[start];
                s[start] = tmp;

                start++;
                end--;
            }
        }
    }

}
