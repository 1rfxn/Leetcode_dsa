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
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, s1);
        dfs(root2, s2);
        return s1.equals(s2);
    }
    private void dfs(TreeNode r,List<Integer> s)
    {
        if(r == null)
            return;
        if(r.left == null && r.right == null)
            s.add(r.val);
        dfs(r.left,s);
        dfs(r.right,s);
    }
}