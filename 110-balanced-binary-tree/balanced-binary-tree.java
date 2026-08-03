/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode r)
    {
        if(r == null)
            return 0;
        int l = height(r.left);
        if(l == -1)
            return -1;
        int ryt = height(r.right);
        if(ryt == -1)
            return -1;
        if(Math.abs(l - ryt) > 1)
            return -1;
        return 1 + Math.max(l,ryt);
    }
}