package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun countNodes(root: TreeNode?): Int {
    if (root == null) return 0
    return 1 + countNodes(root.left) + countNodes(root.right)
}
