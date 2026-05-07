package easy

fun climbStairs(n: Int): Int {
    if (n <= 3) return n

    return climbStairs(n - 1) + climbStairs(n - 2)
}
