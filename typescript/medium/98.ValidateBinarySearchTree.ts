/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function isValidBST(root: TreeNode | null): boolean {
    return dfs(root, null, null)
};

function dfs(node: TreeNode | null, min: number | null, max: number | null): boolean {
    if (node) {
        if (min !== null && node.val <= min) return false
        if (max !== null && node.val >= max) return false
 
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max)
    }

    return true
}
