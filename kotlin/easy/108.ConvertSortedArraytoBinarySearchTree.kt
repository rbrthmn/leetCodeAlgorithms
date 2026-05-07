package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) return null

    return recursiveSortedArrayToBST(nums, 0, nums.size - 1)
}

fun recursiveSortedArrayToBST(nums: IntArray, start: Int, end: Int): TreeNode? {
    if (start > end) return null

    val mid = (end + start) / 2
    val node = TreeNode(nums[mid])

    node.left = recursiveSortedArrayToBST(nums, start, mid - 1)
    node.right = recursiveSortedArrayToBST(nums, mid + 1, end)

    return node
}
