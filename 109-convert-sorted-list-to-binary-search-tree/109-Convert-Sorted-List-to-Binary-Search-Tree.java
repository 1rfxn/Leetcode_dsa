/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode t = head;
        int s = 0;
        while(t != null)
        {   
            s++;
            t = t.next;
        }
        cur = head;
        return inorder(0, s - 1);
    }
    private TreeNode inorder(int l, int r)
    {
        if(l > r)
            return null;
        int mid = l + (r - l) / 2;
        TreeNode ltree = inorder(l, mid - 1);
        TreeNode root = new TreeNode(cur.val);
        root.left = ltree;
        cur = cur.next;
        root.right = inorder(mid + 1, r);
        return root;
    }
}