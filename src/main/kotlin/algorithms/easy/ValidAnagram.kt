package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(242)
fun isAnagram(s: String, t: String): Boolean {
    val string = StringBuilder(t)

    if (s.length == t.length) {
        for (char in s) {
            val i = string.indexOf(char)
            if (i != -1) {
                string.setCharAt(i, ' ')
            }
        }
    }

    return s.length == t.length && string.isBlank()
}
