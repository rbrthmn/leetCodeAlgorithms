package easy

fun Int.toDigits(): List<Int> = toString().map { it.toString().toInt() }

fun isHappy(n: Int): Boolean {
    val sumOfSquares = n.toDigits().fold(0) { acc, digit -> acc + digit * digit }

    return if (sumOfSquares < 10) {
        sumOfSquares == 1
    } else {
        isHappy(sumOfSquares)
    }
}
