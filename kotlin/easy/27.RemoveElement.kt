package easy

fun moveElementToLastIndex(array: IntArray, targetIndex: Int) {
    var startIndex = targetIndex
    while (startIndex < array.lastIndex) {
        val aux = array[startIndex]
        array[startIndex] = array[startIndex + 1]
        array[startIndex + 1] = aux
        startIndex++
    }
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    var i = nums.size - 1
    while (i >= 0) {
        if (nums[i] == `val`) {
            moveElementToLastIndex(nums, i)
        } else {
            k++
        }
        i--
    }

    return k
}
