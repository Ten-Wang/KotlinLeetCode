package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Climbing_Stairs_70 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev = 1;
        int cur = 1;
        // f(n) = f(n-1) + f(n-2)
        for (int i = 2; i <= n; i++) {
            int temp = cur;
            cur = cur + prev;
            prev = temp;
        }
        return cur;
    }

    @Test
    public void exam1() {
        assertEquals(climbStairs(1),1);
        assertEquals(climbStairs(2),2);
        assertEquals(climbStairs(3),3);
        assertEquals(climbStairs(4),5);
        assertEquals(climbStairs(40),165580141);
    }
}
