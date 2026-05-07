package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(205)
fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    for (i in s.indices) {
        if (s.indexOf(s[i]) != t.indexOf(t[i])) return false
    }

    return true
}
