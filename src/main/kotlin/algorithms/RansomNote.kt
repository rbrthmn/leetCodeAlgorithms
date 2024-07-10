package br.com.rbthmn.algorithms

import br.com.rbthmn.Problem

@Problem(383)
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magazineMap = magazine.map { char -> mutableMapOf(char to false) }
    var ransomNoteIndex = 0
    var magazineIndex = 0

    while (ransomNoteIndex < ransomNote.length && magazineIndex < magazine.length) {
        magazineIndex = 0
        while (magazineIndex < magazine.length) {
            if (ransomNote[ransomNoteIndex] == magazine[magazineIndex] && magazineMap[magazineIndex][magazine[magazineIndex]] == false) {
                ransomNoteIndex++
                magazineMap[magazineIndex][magazine[magazineIndex]] = true
                break
            }
            magazineIndex++
        }
    }

    return ransomNoteIndex == ransomNote.length
}
