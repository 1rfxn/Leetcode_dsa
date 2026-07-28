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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode eve = head.next;
        ListNode odd = head;
        ListNode evehed = eve;
        while(eve != null && eve.next != null)
        {
            if(odd != null && odd.next != null)
            {
            odd.next = odd.next.next;
            odd = odd.next;
            }
            if(eve != null && eve.next != null)
            {
            eve.next = eve.next.next;
            eve = eve.next;
            }
        }
        odd.next = evehed;
        return head;
    }
}