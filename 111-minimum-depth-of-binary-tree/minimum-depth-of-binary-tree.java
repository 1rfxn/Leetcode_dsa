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
    public int minDepth(TreeNode root) {
        return h(root);
    }
    private int h(TreeNode r)
    {
        if(r == null)
            return 0;
        if(r.left == null)
            return 1 + h(r.right);
        if(r.right == null)
            return 1 + h(r.left);
        return 1 + Math.min(h(r.left), h(r.right));
    }
}