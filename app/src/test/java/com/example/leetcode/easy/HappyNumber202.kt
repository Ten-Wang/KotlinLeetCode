package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class HappyNumber202 {
    private fun isHappy(n: Int): Boolean {
        var tempN = n
        var num: Int
        for (count in 0..10) {
            num = 0
            var i = tempN
            while (i > 0) {
                num += i % 10 * (i % 10)
                i /= 10
            }
            if (num == 1) return true
            tempN = num
        }
        return false
    }

    @Test
    fun testIsHappy() {
        assertEquals(true, isHappy(19))
    }
}