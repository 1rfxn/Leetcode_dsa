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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> q_ele = new ArrayList<>();
            int n = q.size();
            for(int i = 0 ; i < n ; i++)
            {
                TreeNode t = q.poll();
                q_ele.add(t.val);
                if(t.left != null)
                    q.offer(t.left);
                if(t.right != null)
                    q.offer(t.right);
            }
            res.add(q_ele);
        }
        return res;
    }
}