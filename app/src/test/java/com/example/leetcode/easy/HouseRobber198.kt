package com.example.leetcode.easy

import junit.framework.TestCase
import org.junit.Test

class HouseRobber198 {

    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var prev1 = 0
        var prev2 = 0
        for (num in nums) {
            val tmp = prev1
            prev1 = Math.max(prev2 + num, prev1)
            prev2 = tmp
        }
        return prev1
    }

    var twoBackMax = 0
    var oneBackMax = 0
    fun robBest(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val maxArray = IntArray(nums.size) { 0 }
        for (i in nums.indices) {
            val prev = if (i > 0) {
                maxArray[i - 1]
            } else {
                0
            }
            val twoPrev = if (i > 1) {
                maxArray[i - 2]
            } else {
                0
            }
            maxArray[i] = maxOf(nums[i] + twoPrev, prev)
        }
        return maxArray[nums.size - 1]
    }


    @Test
    fun testRob() {
        TestCase.assertEquals(rob(IntArray(3) { i -> i + 1 }), 4)
        TestCase.assertEquals(rob(IntArray(5) { i -> i + 1 }), 9)
        TestCase.assertEquals(rob(IntArray(5) { i -> i + 1 }), 9)
    }
}