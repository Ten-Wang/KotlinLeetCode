package com.example.leetcode;

import org.junit.Test;

public class Palindrome_Number_9 {
    @Test
    public boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public boolean isPalindrome_BestSolution(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
