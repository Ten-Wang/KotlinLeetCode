package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class NumberOf1Bits191 {
    fun hammingWeight(n: Int): Int {
        val tempN = Integer.toBinaryString(n)
        var bits = 0
        for (s in tempN) {
            if (s.compareTo('1') == 0) {
                bits++
            }
        }
        return bits
    }

    fun hammingWeightBest(n: Int): Int {
        var count = 0L
        val unsigned = if (n >= 0) n else {
            count++ // sign bit
            Integer.MAX_VALUE + n + 1
        }
        var rem = unsigned.toLong()
        while (rem > 0) {
            val dig = rem % 2
            count += dig
            rem /= 2
        }
        return count.toInt()
    }

    @Test
    fun testHammingWeight() {
        assertEquals(hammingWeight(8 + 2 + 1), 3)
    }
}
