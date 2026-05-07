package br.com.rbthmn.algorithms.easy

import br.com.rbthmn.Problem
import br.com.rbthmn.algorithms.utils.TreeNode
import java.util.*

val map = hashMapOf<Int, Pair<Long, Long>>()

@Problem(637)
fun averageOfLevels(root: TreeNode?): ArrayList<Double> {
    dfs(root, 0)
    val ans = arrayListOf<Double>()
    for ((_, v) in map) {
        ans.add(v.second / v.first.toDouble())
    }
    return ans
}

fun dfs(root: TreeNode?, level: Int){
    if (root == null) return
    if (map.containsKey(level)) {
        map[level] = map[level]!!.first + 1 to map[level]!!.second + root.`val`
    }
    else map[level] = 1L to root.`val`.toLong()
    dfs(root.left, level+1)
    dfs(root.right, level+1)
}