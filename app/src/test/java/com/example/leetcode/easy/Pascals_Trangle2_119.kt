package com.example.leetcode.easy

import org.junit.Assert
import org.junit.Test
import kotlin.collections.ArrayList

class Pascals_Trangle2_119 {

    fun generate(numRows: Int): List<Int> {
        val array = mutableListOf(numRows + 1)
        array.add(1)
        for (i in 1 until numRows) {
            array.add(1)
            var prev = array[0]
            for (j in 1 until i) {
                val p = array[j]
                array[j] = array[j] + prev
                prev = p
            }
        }
        return array
    }

    @Test
    fun exam1() {
        val lists = ArrayList<Int>(4)
        lists.add(1)
        lists.add(3)
        lists.add(3)
        lists.add(1)

        Assert.assertEquals(generate(3), lists)
    }
}