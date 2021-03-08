package com.example.leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    
    @Test
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<>());
        for (int i = 0; i < nums.length ; i++) {
            ArrayList newSubsets = new ArrayList();
            for (int k = 0; k < output.size(); k++) {
                List<Integer> temp = new ArrayList<>(output.get(k));
                temp.add(nums[i]);
                newSubsets.add(new ArrayList<>(temp));
            }
            for (int j = 0; j < newSubsets.size(); j++) {
                output.add((List<Integer>) newSubsets.get(j));
            }
        }
        return output;
    }
}
