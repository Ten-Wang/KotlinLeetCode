package com.example.leetcode.easy

import java.util.*


class InvertBinaryTree226 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    private fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val right: TreeNode? = invertTree(root.right)
        val left: TreeNode? = invertTree(root.left)
        root.left = right
        root.right = left
        return root
    }

    private fun invertTreeIterative(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        while (!queue.isEmpty()) {
            val current: TreeNode = queue.poll()
            val temp = current.left
            current.left = current.right
            current.right = temp
            if (current.left != null) queue.add(current.left)
            if (current.right != null) queue.add(current.right)
        }
        return root
    }
}