package com.example.leetcode;

public class Plus_One_66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        for (; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        if (i < 0 && digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 0; j < digits.length; j++){
                result[j + 1] = digits[j];
            }
            return result;
        }
        return digits;
    }
}
