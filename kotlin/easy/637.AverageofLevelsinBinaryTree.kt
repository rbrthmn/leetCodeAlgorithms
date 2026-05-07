package easy

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

val map = hashMapOf<Int, Pair<Long, Long>>()

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