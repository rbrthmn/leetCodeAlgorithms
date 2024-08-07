package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(392)
fun isSubsequence(s: String, t: String): Boolean {
    var sIndex = 0
    var tIndex = 0

    while (sIndex < s.length && tIndex < t.length) {
        if (s[sIndex] == t[tIndex]) {
            sIndex++
        }
        tIndex++
    }

    return sIndex == s.length
}
