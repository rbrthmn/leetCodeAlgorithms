package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode

@Problem(112)
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if ((root?.right != null || root?.left != null)) return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    if (targetSum != root?.`val`) return false
    return true
}
