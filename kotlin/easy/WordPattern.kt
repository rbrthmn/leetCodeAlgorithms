package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(290)
fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(' ')

    if (pattern.length == words.size) {
        for (index in words.indices) {
            if (index > 0){
                for (index2 in index - 1 downTo 0) {
                    if (pattern[index] == pattern[index2] && words[index] != words[index2] ||
                        pattern[index] != pattern[index2] && words[index] == words[index2] ) {
                        return false
                    }
                }
            }
        }
    } else return false

    return true
}
