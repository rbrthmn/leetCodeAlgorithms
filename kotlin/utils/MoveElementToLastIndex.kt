package br.com.rbthmn.algorithms.utils

fun moveElementToLastIndex(array: IntArray, targetIndex: Int) {
    var startIndex = targetIndex
    while (startIndex < array.lastIndex) {
        val aux = array[startIndex]
        array[startIndex] = array[startIndex + 1]
        array[startIndex + 1] = aux
        startIndex++
    }
}
