package com.example.leetcode.easy

import junit.framework.Assert.assertEquals
import org.junit.Test

class ContainsDuplicate217 {
    private fun containsDuplicate(nums: IntArray): Boolean {
        val hashMap = HashMap<Int, Boolean>()
        for (num in nums) {
            if (hashMap[num] == null) {
                hashMap[num] = true
            } else {
                return true
            }
        }
        return false
    }

    @Test
    fun testContainsDuplicate() {
        assertEquals(true, containsDuplicate(intArrayOf(1, 2, 3, 1)))
        assertEquals(false, containsDuplicate(intArrayOf(1, 2, 3, 4)))
        assertEquals(true, containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }
}