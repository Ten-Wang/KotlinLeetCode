package com.example.leetcode.easy

import junit.framework.TestCase.assertTrue
import org.junit.Test

class Summary_Ranges_228 {

    @Test
    fun testSummaryRanges() {
        var nums = intArrayOf(0,1,2,4,5,7)
        var expect = arrayListOf("0->2","4->5","7")
        assertTrue(expect == summaryRanges(nums))

        nums = intArrayOf(0,2,3,4,6,8,9)
        expect = arrayListOf("0","2->4","6","8->9")
        assertTrue(expect == summaryRanges(nums))

        nums = intArrayOf()
        expect = arrayListOf()
        assertTrue(expect == summaryRanges(nums))

        nums = intArrayOf(-1)
        expect = arrayListOf("-1")
        assertTrue(expect == summaryRanges(nums))

        nums = intArrayOf(0)
        expect = arrayListOf("0")
        assertTrue(expect == summaryRanges(nums))
    }


    private fun summaryRanges(nums: IntArray): Any {
        val output: MutableList<String> = ArrayList()
        var start = 0
        var end = 0
        while (end < nums.size - 1) {
            if (nums[end] + 1 != nums[end + 1]) {
                if (end != start)
                    output.add(nums[start].toString() + "->" + nums[end])
                else
                    output.add( nums[start].toString())
                start = end + 1
            }
            end++
        }
        if (end == nums.size - 1) {
            if (end != start)
                output.add(nums[start].toString() + "->" + nums[end])
            else
                output.add(nums[start].toString())
        }

        return output
    }


}