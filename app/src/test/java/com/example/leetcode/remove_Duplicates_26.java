package com.example.leetcode;

import org.junit.Test;

public class remove_Duplicates_26 {

    @Test
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}
