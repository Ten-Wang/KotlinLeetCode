package com.example.leetcode;

import org.junit.Test;

public class Roman_to_Integer_13 {

    @Test
    public int romanToInt(String resource) {
        int[] numbers = new int[resource.length()];
        for (int i = 0; i < resource.length(); i++) {
            switch (resource.charAt(i)) {
                case 'M':
                    numbers[i] = 1000;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'I':
                    numbers[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1])
                sum -= numbers[i];
            else
                sum += numbers[i];
        }
        return sum + numbers[numbers.length - 1];
    }
}
