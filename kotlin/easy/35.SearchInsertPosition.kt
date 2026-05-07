package easy

fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 0
    while (nums[index] < target) {
        index++
        if (index > nums.size) {
            break
        }
    }

    return index
}
