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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode dmy = head;
        int idx = 0;
        for(int i = 0 ; i < lists.length ; i++)
        {
            dmy.next = lists[i];
            while(dmy.next != null)
            {
                idx++;
                dmy = dmy.next;
            }
        }
        ListNode d = head;
        int a[] = new int[idx];
        int i = 0;
        for(i = 0 ; i < idx ; i++)
        {
            d = d.next;
            a[i] = d.val;
        }
        Arrays.sort(a);
        ListNode res = new ListNode();
        ListNode t = res;
        i = 0;
        while(i < a.length)
        {
            ListNode h = new ListNode(a[i]);
            t.next = h;
            t = t.next;
            i++;
        }
        return res.next;
    }
}