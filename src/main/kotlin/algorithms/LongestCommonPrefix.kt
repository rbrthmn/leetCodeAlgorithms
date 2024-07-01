package br.com.rbthmn.algorithms

import br.com.rbthmn.Problem

@Problem(14)
fun longestCommonPrefix(strs: Array<String>): String {
    var longestPrefix = ""
    var arrayIndex = 0
    var stringIndex = 0

    if (strs.size > 1 && strs.first().isNotBlank()) {
        while (stringIndex in strs[0].indices
            && stringIndex in strs[arrayIndex].indices
            && strs[0][stringIndex] == strs[arrayIndex][stringIndex]) {
            if (arrayIndex == strs.size - 1) {
                longestPrefix += strs[arrayIndex][stringIndex]
                stringIndex++
                arrayIndex = 0
            }

            arrayIndex++
        }
    } else {
        longestPrefix = strs.first()
    }

    return longestPrefix
}
