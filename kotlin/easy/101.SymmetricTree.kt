package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isSymmetric(root: TreeNode?): Boolean {
    return isMirror(root, root)
}

fun isMirror(x: TreeNode?, y: TreeNode?): Boolean {
    if (x == null && y == null) return true
    if (x == null || y == null) return false
    return x.`val` == y.`val` && isMirror(x.left, y.right) && isMirror(x.right, y.left)
}
