package easy

fun isPalindrome(s: String): Boolean {
    val formattedString = s.trim().filter {
        char -> char.isLetter() || char.isDigit()
    }.lowercase()
    var indexOfLastChar = formattedString.length - 1
    var isPalindrome = true

    for (char in formattedString) {
        if (char != formattedString[indexOfLastChar]) {
            isPalindrome = false
        }
        indexOfLastChar--
    }

    return isPalindrome
}
