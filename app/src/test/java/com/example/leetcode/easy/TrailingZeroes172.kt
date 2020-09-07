package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.math.BigDecimal

class TrailingZeroes172 {

    private fun trailingZeroes(n: Int): Int {
        if (n == 0 || n == 1) {
            return 0
        }
        var resource = BigDecimal.ONE
        for (i in n downTo 2) {
            resource *= i.toBigDecimal()
        }
        var count = 0
        while (resource.rem(10.toBigDecimal()) == BigDecimal.ZERO) {
            resource /= 10.toBigDecimal()
            count++
            if (resource == 0.toBigDecimal()) {
                break
            }
        }
        return count
    }

    private fun trailingZeroesBest(n: Int): Int {
        var tempN = n
        var count = 0
        while (tempN > 4)
            count += 5.let {
                tempN /= it; tempN
            }
        return count
    }

    @Test
    fun testTrailingZeroes() {
        assertEquals(0, trailingZeroesBest(3))
        assertEquals(1, trailingZeroesBest(5))
        assertEquals(2, trailingZeroesBest(10))
        assertEquals(4, trailingZeroesBest(20))
        assertEquals(7, trailingZeroesBest(30))
        assertEquals(580, trailingZeroesBest(2331))
        assertEquals(589, trailingZeroesBest(2371))
    }
}