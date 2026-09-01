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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dmy = head;
        int c = 0;
        int v = 0;
        while(dmy != null)
        {
            c++;
            if(c == k)
                v = dmy.val;
            dmy = dmy.next;
        }
        c -= k;
        ListNode d2 = head;
        int x = 0;
        while(c != 0)
        {
            c--;
            d2 = d2.next;
        }
        x = d2.val;
        d2.val = v;
        ListNode d1 = head;
        while(k - 1 != 0)
        {
            d1 = d1.next;
            k--;
        }
        d1.val = x;
        return head;
    }
}