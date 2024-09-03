package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode

@Problem(100)
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p?.`val` != q?.`val`) return false
    return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
}
