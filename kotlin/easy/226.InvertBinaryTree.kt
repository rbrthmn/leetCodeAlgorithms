package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun invertTree(root: TreeNode?): TreeNode? {
    if (root?.left == null && root?.right == null) return root
    return root.apply {
        val temp = right
        right = invertTree(left)
        left = invertTree(temp)
    }
}
