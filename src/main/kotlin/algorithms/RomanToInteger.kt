package br.com.rbthmn.algorithms

import br.com.rbthmn.Problem

@Problem(13)
fun romanToInt(s: String): Int {
    fun directParse(c: Char): Int {
        return when (c) {
            RomanNumbers.I.name.first() -> RomanNumbers.I.value
            RomanNumbers.V.name.first() -> RomanNumbers.V.value
            RomanNumbers.X.name.first() -> RomanNumbers.X.value
            RomanNumbers.L.name.first() -> RomanNumbers.L.value
            RomanNumbers.C.name.first() -> RomanNumbers.C.value
            RomanNumbers.D.name.first() -> RomanNumbers.D.value
            RomanNumbers.M.name.first() -> RomanNumbers.M.value
            else -> 0
        }
    }

    var number = 0
    var index = 0
    while (index in s.indices) {
        number += if (index != s.length - 1) {
            when {
                (s[index] == RomanNumbers.I.name.first() && s[index + 1] == RomanNumbers.V.name.first()) -> {
                    index++
                    4
                }
                (s[index] == RomanNumbers.I.name.first() && s[index + 1] == RomanNumbers.X.name.first()) -> {
                    index++
                    9
                }
                (s[index] == RomanNumbers.X.name.first() && s[index + 1] == RomanNumbers.L.name.first()) -> {
                    index++
                    40
                }
                (s[index] == RomanNumbers.X.name.first() && s[index + 1] == RomanNumbers.C.name.first()) -> {
                    index++
                    90
                }
                (s[index] == RomanNumbers.C.name.first() && s[index + 1] == RomanNumbers.D.name.first()) -> {
                    index++
                    400
                }
                (s[index] == RomanNumbers.C.name.first() && s[index + 1] == RomanNumbers.M.name.first()) -> {
                    index++
                    900
                }
                else -> {
                    directParse(s[index])
                }
            }
        } else {
            directParse(s[index])
        }
        index++
    }

    return number
}

enum class RomanNumbers(val value: Int) {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000)
}
