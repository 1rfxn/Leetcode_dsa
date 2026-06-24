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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        while(slow != null)
        {
            ListNode nxt = slow.next;
            slow.next = pre;
            pre = slow;
            slow = nxt;
        }
        while(pre != null)
        {
            if(pre.val != head.val)
                return false;
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}