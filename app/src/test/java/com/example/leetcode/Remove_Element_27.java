package com.example.leetcode;

import android.util.Log;

import org.junit.Test;

public class Remove_Element_27 {
    @Test
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];
                len--;
                i--;
            }
        }
        return len;
    }
}
