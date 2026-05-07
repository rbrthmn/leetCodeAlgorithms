package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.toDigits

@Problem(202)
fun isHappy(n: Int): Boolean {
    val sumOfSquares = n.toDigits().fold(0) {acc, digit -> acc + digit * digit }

    return if (sumOfSquares < 10) {
        sumOfSquares == 1
    } else {
        isHappy(sumOfSquares)
    }
}
