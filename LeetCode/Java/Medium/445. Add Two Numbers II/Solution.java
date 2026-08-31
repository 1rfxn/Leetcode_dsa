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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = 0;
        int n2 = 0;
        ListNode d1 = l1;
        ListNode d2 = l2;
        while(d1 != null)
        {
            n1 = n1 * 10 + d1.val;
            d1 = d1.next;
        }
        while(d2 != null)
        {
            n2 = n2 * 10 + d2.val;
            d2 = d2.next;
        }
        int n = n1 + n2;
        String num = n + "";
        ListNode res = new ListNode();
        ListNode dmy = res;
        for(int i = 0 ; i < num.length() ; i++)
        {
            dmy.next = new ListNode(num.charAt(i) - '0');
            dmy = dmy.next;
        }
        return res.next;
    }
}