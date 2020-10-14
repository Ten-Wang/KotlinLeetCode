package com.example.leetcode.easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CountPrimes202 {
    fun countPrimes(n: Int): Int {
        val notPrime = BooleanArray(n)
        var count = 0
        for (i in 2 until n) {
            if (!notPrime[i]) {
                count++
                var j = 2
                while (i * j < n) {
                    notPrime[i * j] = true
                    j++
                }
            }
        }

        return count
    }

    fun countPrimesStartFrom3(n: Int): Int {
        if (n <= 2) {
            return 0
        }
        val notPrime = BooleanArray(n)
        notPrime[2] = false
        var num : Int
        var count = 1
        var adder : Int
        for (x in 3 until n step 2) {
            if (!notPrime[x]) {
                num = 3 * x
                adder = x * 2
                count++
                while (num < n) {
                    notPrime[num] = true
                    num += adder
                }
            }
        }
        return count
    }

    @Test
    fun testMajorityElement() {
        assertEquals(0, countPrimes(2))
        assertEquals(4, countPrimes(10))
    }
}