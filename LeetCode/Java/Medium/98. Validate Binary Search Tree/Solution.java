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
    public boolean isValidBST(TreeNode root) {
        return chk(root,Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean chk(TreeNode r, long max, long min)
    {
        if(r == null)
            return true;
        if(r.val <= min || r.val >= max)
            return false;
        return chk(r.left, r.val, min) && chk(r.right, max, r.val);
    }
}