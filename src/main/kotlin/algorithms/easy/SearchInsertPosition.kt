package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(35)
fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 0
    while (nums[index] < target) {
        index++
        if (index > nums.size) {
            break
        }
    }

    return index
}