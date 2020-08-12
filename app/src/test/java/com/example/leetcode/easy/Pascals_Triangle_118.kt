package com.example.leetcode.easy

import org.junit.Assert
import org.junit.Test
import java.util.*

class Pascals_Triangle_118 {
    fun generate(numRows: Int): List<List<Int>> {
        val lists: MutableList<List<Int>> =
            ArrayList()
        var temp: ArrayList<Int>
        return if (numRows == 0) {
            lists
        } else if (numRows == 1) {
            temp = ArrayList()
            temp.add(1)
            lists.add(temp)
            lists
        } else {
            temp = ArrayList()
            temp.add(1)
            lists.add(temp)
            temp = ArrayList()
            temp.add(1)
            temp.add(1)
            lists.add(temp)
            for (i in 2 until numRows) {
                temp = ArrayList()
                for (j in 0 until i + 1) {
                    if (j == 0) {
                        temp.add(1)
                    } else if (j == i) {
                        temp.add(1)
                    } else {
                        val prev = lists[i - 1]
                        temp.add(prev[j] + prev[j - 1])
                    }
                }
                lists.add(temp)
            }
            lists
        }
    }

    @Test
    fun exam1() {
        val lists: MutableList<List<Int>> =
            ArrayList()
        val list1 = ArrayList<Int>()
        list1.add(1)
        lists.add(list1)
        Assert.assertEquals(generate(1), lists)
    }
}