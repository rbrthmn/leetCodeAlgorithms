package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode

@Problem(226)
fun invertTree(root: TreeNode?): TreeNode? {
    if (root?.left == null && root?.right == null) return root
    return root.apply {
        val temp = right
        right = invertTree(left)
        left = invertTree(temp)
    }
}
