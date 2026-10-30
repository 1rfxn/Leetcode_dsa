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
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        int sec = -1;
        return second(root,min,sec);
    }
    private int second(TreeNode r,int min, int sec)
    {
        if(r == null)
            return sec;
        if(r.val > min)
        {
            if(sec == -1 || r.val < sec)
                sec = r.val;
        }
        sec = second(r.left, min, sec);
        sec = second(r.right, min, sec);
        return sec;
    }
}