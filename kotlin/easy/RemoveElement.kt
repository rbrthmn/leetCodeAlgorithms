package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.moveElementToLastIndex

@Problem(27)
fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    var i =  nums.size - 1
    while (i >= 0) {
        if (nums[i] == `val`) {
                moveElementToLastIndex(nums, i)
        } else {
            k++
        }
        i--
    }

    return k
}
