package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem

@Problem(20)
fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    if (s.length % 2 == 0) {
        for (char in s) {
            if (char == '(' || char == '[' || char == '{') {
                stack.add(char)
            } else {
                when (char) {
                    ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else return false
                    ']' -> if (stack.isNotEmpty() && stack.last() == '[') stack.removeLast() else return false
                    '}' -> if (stack.isNotEmpty() && stack.last() == '{') stack.removeLast() else return false
                }
            }
        }
    } else return false

    return stack.isEmpty()
}
