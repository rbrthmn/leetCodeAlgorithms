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

fun removeDuplicates(nums: IntArray): Int {
    var pivot = nums.last()
    var k = 1
    var index = nums.size - 1

    if (nums.size > 1) {
        while (index >= 0) {
            if (nums[index] == pivot) {
                moveElementToLastIndex(nums, index)
            } else {
                pivot = nums[index]
                k++
            }
            index--
        }
    } else k = 1

    return k
}
