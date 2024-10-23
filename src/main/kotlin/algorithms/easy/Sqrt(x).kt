package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(69)
fun mySqrt(x: Int): Int {
    if (x == 0) return 0

    var left = 1
    var right = x
    var result = 0

    while (left <= right) {
        val mid = left + (right - left) / 2
        if (mid <= x / mid) {
            left = mid + 1
            result = mid
        } else {
            right = mid - 1
        }
    }

    return result
}
