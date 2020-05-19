package com.example.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

class Two_Sum_2 {
    @Test
    public int[] twoSum(int[] numbers, int target) {
        boolean isSmall = false;
        long small = numbers[0];
        long big = target - small;
        int left = 0;
        int right = numbers.length - 1;
        while (true) {
            if (isSmall) {
                isSmall = false;
                left = binarySearch(numbers, left, right - 1, small);
                if (numbers[left] + numbers[right] == target) {
                    break;
                } else {
                    small = numbers[++left];
                    big = target - small;
                }
            } else {
                isSmall = true;
                right = binarySearch(numbers, left + 1, right, big);
                if (numbers[left] + numbers[right] == target) {
                    break;
                } else {
                    big = numbers[right];
                    small = target - big;
                }
            }
        }
        return new int[]{left + 1, right + 1};
    }

    public int binarySearch(int[] nums, int l, int r, long target) {
        int left = l;
        int right = r;
        while (left < right) {
            int mid = right + (left - right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}