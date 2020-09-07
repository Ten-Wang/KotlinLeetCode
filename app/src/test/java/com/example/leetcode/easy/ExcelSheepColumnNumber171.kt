package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test
import kotlin.math.pow

class ExcelSheepColumnNumber171 {
    private fun titleToNumber(s: String): Int {
        var count = 0
        for (i in s.length - 1 downTo 0) {
            val j = s.length - 1 - i
            count +=
                (s[i] - '@') * 26.0.pow(j.toDouble()).toInt()
        }
        return count
    }

    private fun titleToNumberBest(s: String): Int {
        var value = 0
        for (c in s) {
            value = (value * 26) + (c - 'A' + 1)
        }
        return value
    }

    @Test
    fun testTitleToNumber() {
        assertEquals(titleToNumber("A"), 1)
        assertEquals(titleToNumber("AB"), 28)
        assertEquals(titleToNumber("ZY"), 701)
        assertEquals(titleToNumber("AAA"), 703)
    }
}