package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(1)
fun twoSum(nums: IntArray, target: Int): IntArray {
    var i = 0
    while (i < nums.size) {
        var j = nums.size - 1
        while (j > i) {
            if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            else j--
        }
        i++
    }
    return intArrayOf()
}