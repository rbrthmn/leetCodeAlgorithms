package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(228)
fun summaryRanges(nums: IntArray): List<String> {
    val summaries = mutableListOf<String>()
    val stack = mutableListOf<Int>()
    var index = 0

    while (index < nums.size) {
        if (index < nums.size - 1 && nums[index] + 1 == nums[index + 1]) {
            stack.add(nums[index])
            index++
        } else {
            stack.add(nums[index])
            summaries.add(
                if (stack.size == 1) "${nums[index]}"
                else "${stack.first()}->${nums[index]}"
            )
            stack.clear()
            index++
        }
    }

    return summaries
}
