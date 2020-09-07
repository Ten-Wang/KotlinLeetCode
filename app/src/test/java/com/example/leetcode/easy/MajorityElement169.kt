package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MajorityElement169 {
    fun majorityElement(nums: IntArray): Int {
        val middle = nums.size / 2
        val capitalCities: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val k = capitalCities[nums[i]]
            if (k != null) {
                capitalCities[nums[i]] = k + 1
            } else {
                capitalCities[nums[i]] = 1
            }
        }
        for (i in capitalCities.entries) {
            if (i.value > middle) {
                return i.key
            }
        }
        return 0
    }

    @Test
    fun testMajorityElement() {
        assertEquals(4, majorityElement(intArrayOf(2, 1, 1, 2, 2)))
    }
}