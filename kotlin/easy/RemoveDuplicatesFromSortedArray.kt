package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.moveElementToLastIndex

@Problem(26)
fun removeDuplicates(nums: IntArray): Int {
    var pivot = nums.last()
    var k = 1
    var index = nums.size - 1

    if (nums.size > 1) {
        while (index >= 0) {
            if (nums[index] == pivot) {
                moveElementToLastIndex(nums, index)
            } else {
                pivot = nums[index]
                k++
            }
            index--
        }
    } else k = 1

    return k
}
