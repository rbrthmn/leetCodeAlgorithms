package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode

@Problem(101)
fun isSymmetric(root: TreeNode?): Boolean {
    return isMirror(root, root)
}

fun isMirror(x: TreeNode?, y: TreeNode?): Boolean {
    if (x == null && y == null) return true
    if (x == null || y == null) return false
    return x.`val` == y.`val` && isMirror(x.left, y.right) && isMirror(x.right, y.left)
}
