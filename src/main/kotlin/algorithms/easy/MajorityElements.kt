package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(169)
fun majorityElement(nums: IntArray): Int {
    val matrix = nums.map { intArrayOf(it, 0) }

    for (index in matrix.indices) {
        var number = 0
        val pivot = nums[index]

        for (num in nums) {
            if (num == pivot) {
                number++
            }
        }

        matrix[index][1] = number
    }

    var indexOfMajorElement = 0
    var numberMajorElement = matrix.first()[1]
    for (index in matrix.indices) {
        if (matrix[index][1] > numberMajorElement) {
            numberMajorElement = matrix[index][1]
            indexOfMajorElement = index
        }
    }

    return matrix[indexOfMajorElement][0]
}
