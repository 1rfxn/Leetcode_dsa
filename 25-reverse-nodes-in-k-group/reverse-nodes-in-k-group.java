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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode c = head;
        int s = 1;
        while(c.next != null)
        {
            s++;
            c = c.next;
        }
        int r = s % k;
        s -= r;
        ListNode res = new ListNode(0);
        ListNode fres = res;
        ListNode dmy = head;
        while(dmy != null && s >= k)
        {
            ListNode r1 = null;
            for(int i = 0 ; i < k ; i++)
            {
                ListNode t = dmy.next;
                dmy.next = r1;
                r1 = dmy;
                dmy = t;
                if(dmy == null)
                    break;
            } 
            res.next = r1;
            while(res.next != null)
            {
                res = res.next;
            }
            s -= k;
        }
        res.next = dmy;
        return fres.next;
    }
}