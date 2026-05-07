package easy

fun strStr(haystack: String, needle: String): Int {
    var haystackIndex = 0

    while (haystackIndex in haystack.indices) {
        var needleIndex = haystackIndex
        if (haystack[haystackIndex] == needle[0]) {
            var comp = ""
            while (needleIndex in haystack.indices && comp.length < needle.length) {
                comp += haystack[needleIndex]
                needleIndex++
            }

            if (comp == needle) {
                return haystackIndex
            }
        }
        haystackIndex++
    }

    return -1
}
