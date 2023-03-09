package org.example;

public class PalindromeNumbers {

    public boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int reversedNumber = 0;

        while (number > reversedNumber) {
            int digit = number % 10;
            reversedNumber = reversedNumber *10 + digit;
            number = number / 10;
        }

        return reversedNumber == number || number == reversedNumber / 10;


    }
}
