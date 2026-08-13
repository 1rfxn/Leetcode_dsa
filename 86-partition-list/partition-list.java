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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode dmy = head;
        ListNode f = new ListNode();
        ListNode tf = f;
        ListNode g = new ListNode();
        ListNode tg = g;
        while(dmy != null)
        {
            ListNode t = dmy.next;
            dmy.next = null;
            if(dmy.val >= x)
            {
                g.next = dmy;
                g = g.next;
            }
            else
            {
                f.next = dmy;
                f = f.next;
            }
            dmy = t;
        }
        f.next = tg.next;
        return tf.next;
    }
}