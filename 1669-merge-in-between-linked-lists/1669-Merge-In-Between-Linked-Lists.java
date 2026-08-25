class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int s = 0;
        ListNode dmy = list1;
        ListNode h = list1;
        ListNode h1 = list1;
        ListNode h2 = list1;

        while (dmy.next != null) {
            dmy = dmy.next;
            s++;
            if (s == a - 1)
                h1 = dmy;
            if (s == b) {
                h2 = dmy.next;
                break;
            }
        }
        h1.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = h2;
        return list1;
    }
}