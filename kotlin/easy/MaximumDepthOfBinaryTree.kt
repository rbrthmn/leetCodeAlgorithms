package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode
import kotlin.math.max

@Problem(104)
fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return 1 + max(maxDepth(root.left), maxDepth(root.right))
}
