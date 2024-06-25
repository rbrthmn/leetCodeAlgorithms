package br.com.rbthmn.algorithms

import br.com.rbthmn.Problem

@Problem(58)
fun lengthOfLastWord(s: String): Int {
    var index = s.length - 1
    var lastWordLength = 0

    while (index in 0..s.length) {
        if (s[index] != ' ') {
            lastWordLength++
        } else if (s[index] == ' ' && lastWordLength > 0) {
            break
        }
        index--
    }

    return lastWordLength
}