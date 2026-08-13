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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }
        ListNode r = null;
        while(s != null)
        {
            ListNode t = s.next;
            s.next = r;
            r = s;
            s = t;
        }
        ListNode dmy = head;
        while(r.next != null)
        { 
            ListNode t1 = dmy.next;
            ListNode t2 = r.next;
            dmy.next = r;
            r.next = t1;
            dmy = t1;
            r = t2;
        }
    }
}