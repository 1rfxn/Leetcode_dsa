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

        l1 = rev(l1);
        l2 = rev(l2);

        ListNode res = new ListNode();
        ListNode dmy = res;

        int c = 0;

        while (l1 != null || l2 != null) {

            int num = c;

            if (l1 != null) {
                num += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                num += l2.val;
                l2 = l2.next;
            }

            c = num / 10;
            num = num % 10;

            dmy.next = new ListNode(num);
            dmy = dmy.next;
        }

        // If carry is still remaining
        if (c != 0) {
            dmy.next = new ListNode(c);
        }

        return rev(res.next);
    }

    private ListNode rev(ListNode l) {

        ListNode r = null;
        ListNode d = l;

        while (d != null) {
            ListNode t = d.next;
            d.next = r;
            r = d;
            d = t;
        }

        return r;
    }
}