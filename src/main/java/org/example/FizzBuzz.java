package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzChange(int number) {
        if (number < 1) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<String>(number);

        for (int i = 1; i <= number; i++) {
            String value = "";
            if (i % 3 == 0) {
                value = "fizz";
            }
            if (i % 5 == 0) {
                value = value + "buzz";
            }
            if (value.isBlank()) {
                value = String.valueOf(i);
            }


            result.add(value);
        }

        return result;
    }
}
