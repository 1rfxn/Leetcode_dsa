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
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        preorder(root,"");
        return res;
    }
    private void preorder(TreeNode r, String p)
    {
        if(r == null)
            return;
        if(p.length() == 0)
            p += (r.val+"");
        else
            p = p + "->" + r.val;
        if(r.left == null && r.right == null)
            res.add(p);
        preorder(r.left,p);
        preorder(r.right,p);
    }
}