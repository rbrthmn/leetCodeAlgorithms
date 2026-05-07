package easy

fun isPalindrome(x: Int): Boolean {
    return if ((x < 0)) false
    else {
        val string = x.toString()
        var indexX = 0
        var indexY = string.length - 1
        while (indexX <= indexY) {
            if (string[indexX] != string[indexY]) {
                return false
            }
            indexX++
            indexY--
        }
        return true
    }
}
