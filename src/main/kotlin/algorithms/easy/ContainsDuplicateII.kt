package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import kotlin.math.abs

@Problem(219)
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    fun isValid(k: Int, i: Int, j: Int): Boolean = k >= abs(i - j)

    var hasValidDuplicates = false

    for (index in nums.indices) {
        if (hasValidDuplicates) break
        for (index2 in nums.size - 1 downTo index + 1) {
            if (nums[index] == nums[index2] && isValid(k, index, index2)) {
                hasValidDuplicates = true
                break
            }
        }
    }

//    for (index in nums.indices) {
//        val arrayWithSameValue = nums.map { num -> if(num == nums[index]) num. }
//    }

    return hasValidDuplicates
}
