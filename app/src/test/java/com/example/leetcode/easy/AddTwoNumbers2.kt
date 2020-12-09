package com.example.leetcode.easy

import org.junit.Test

class AddTwoNumbers2 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun stdAddTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var p = l1
        var q = l2
        var curr: ListNode? = dummyHead
        var carry = 0
        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 10
            curr!!.next = ListNode(sum % 10)
            curr = curr.next
            if (p != null) p = p.next
            if (q != null) q = q.next
        }
        if (carry > 0) {
            curr!!.next = ListNode(carry)
        }
        return dummyHead.next
    }

    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var tempL1 = l1
        var tempL2 = l2
        val result = ListNode(0)
        var tempResult: ListNode = result
        var plus = false
        while (tempL1 != null || tempL2 != null) {
            var temp = 0
            if (tempL1 != null) {
                temp += tempL1.`val`
                tempL1 = tempL1.next
            }
            if (tempL2 != null) {
                temp += tempL2.`val`
                tempL2 = tempL2.next
            }
            if (plus) {
                temp += 1
                plus = false
            }
            if (temp > 9) {
                plus = true
            }
            tempResult.`val` = temp % 10
            if (tempL1 != null || tempL2 != null || plus) {
                tempResult.next = ListNode(1)
                tempResult = tempResult.next!!
            }
        }
        return result

    }

    @Test
    fun `test 0 addTwoNumbers`() {
        val input10 = ListNode(0)
        val input20 = ListNode(0)
        var result = addTwoNumbers(input10, input20)
        while (result?.next != null) {
            print("test:  " + result.`val`)
            result = result.next
        }
    }

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

    @Test
    fun `test 243 564 addTwoNumbers`() {
        val input10 = ListNode(2)
        val input11 = ListNode(4)
        val input12 = ListNode(3)
        input10.next = input11
        input11.next = input12
        val input20 = ListNode(5)
        val input21 = ListNode(6)
        input20.next = input21
        val input22 = ListNode(4)
        input21.next = input22

        val input30 = ListNode(7)
        val input31 = ListNode(0)
        input30.next = input31
        val input32 = ListNode(8)
        input31.next = input32

        var result = addTwoNumbers(input10, input20)
        while (result?.next != null) {
            print("test:  " + result.`val`)
            result = result.next
        }
    }
}