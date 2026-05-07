package easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if ((root?.right != null || root?.left != null)) return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    if (targetSum != root?.`val`) return false
    return true
}
