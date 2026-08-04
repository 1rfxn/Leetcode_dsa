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
    public boolean isSymmetric(TreeNode root) {
        TreeNode l = root.left;
        TreeNode r = root.right;
        return sym(l,r);
    }
    private boolean sym(TreeNode t1, TreeNode t2)
    {
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        if(t1.val != t2.val)
            return false;
        return sym(t1.left, t2.right) && sym(t1.right, t2.left);
    }
} 