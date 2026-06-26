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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        int len = 0;
        while(l != null)
        {
            len++;
            l = l.next;
        }
        if(len == n)
            return head.next;
        len -= n;
        ListNode pre = head;
        ListNode con = head;
        while(con != null)
        {
            len--;
            if(len == 0)
            {
                con = con.next.next;
                pre.next = con;
                break;
            }
            else
                pre = pre.next;
                con = con.next;
        }
        return head;
    }
}