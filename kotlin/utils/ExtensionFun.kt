package br.com.rbthmn.algorithms.utils

fun Int.toDigits(): List<Int> = toString().map { it.toString().toInt() }
