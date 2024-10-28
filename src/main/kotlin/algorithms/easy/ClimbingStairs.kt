package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(70)
fun climbStairs(n: Int): Int {
    if (n <= 3) return n

    return climbStairs(n - 1) + climbStairs(n - 2)
}
