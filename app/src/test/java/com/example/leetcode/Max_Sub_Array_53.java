package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Max_Sub_Array_53 {

    public static int maxSubArray(int[] nums)
    {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int curMax = max;
        for (int i = 1; i < nums.length; i++) {
            curMax = nums[i] > (curMax + nums[i]) ? nums[i] : curMax + nums[i];
            max = curMax > max ? curMax : max;
        }
        return max;
    }

    @Test
    public void testMaxSubArray() {
        int[] sum = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(maxSubArray(sum), 6);
        int[] sum2 = {-1};
        assertEquals(maxSubArray(sum2), -1);
        int[] sum3 = {1, 2};
        assertEquals(maxSubArray(sum3), 3);
        int[] sum4 = {-1, 0, -2, 2};
        assertEquals(maxSubArray(sum4), 2);
        int[] sum5 = {-3, -2, 0, -1};
        assertEquals(maxSubArray(sum5), 0);
    }
}
