package com.example.leetcode;

import android.util.Log;

import org.junit.Test;

public class Search_Insert_Position_35 {

    @Test
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
