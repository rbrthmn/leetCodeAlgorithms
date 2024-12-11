package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode

@Problem(108)
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null

    return recursiveSortedArrayToBST(nums, 0, nums.size - 1)
}

fun recursiveSortedArrayToBST(nums: IntArray, start: Int, end: Int): TreeNode? {
    if (start > end) return null

    val mid = (end + start) / 2
    val node = TreeNode(nums[mid])

    node.left = recursiveSortedArrayToBST(nums, start, mid - 1)
    node.right = recursiveSortedArrayToBST(nums, mid + 1, end)

    return node
}
