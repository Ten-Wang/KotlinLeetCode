package com.example.leetcode;

import org.junit.Test;

public class Merge_Two_Sorted_Lists_21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    @Test
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode result = null;
        if (l1.val <= l2.val) {
            result = l1;
        } else {
            result = l2;
        }
        ListNode cur = result;
        while (l1 != null && l2 != null) {
            ListNode next = null;
            if (l1.val <= l2.val) {
                next = l1;
                l1 = l1.next;
            } else {
                next = l2;
                l2 = l2.next;
            }
            cur.next = next;
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return result;
    }
}
