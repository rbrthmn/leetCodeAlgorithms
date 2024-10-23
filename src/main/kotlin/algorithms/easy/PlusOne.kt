package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(66)
fun plusOne(digits: IntArray): IntArray {
    var index = digits.size - 1
    while (index >= 0) {
        if (digits[index] != 9) {
            digits[index]++
            break
        } else {
            digits[index] = 0
            index--
            if (index < 0) {
                val newArray = intArrayOf(1) + digits
                return newArray
            }
        }
    }
    return digits
}
