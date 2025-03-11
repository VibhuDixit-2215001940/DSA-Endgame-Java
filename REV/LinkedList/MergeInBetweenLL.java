class Solution {
    public ListNode mergeInBetween(ListNode l1, int a, int b, ListNode l2) {
        ListNode left = null, right = l1;
        for (int i = 0; i <= b; i++) {
            if (i == a - 1)
                left = right;
            right = right.next;
        }
        left.next = l2;
        ListNode temp = l2;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = right;
        return l1;
    }
}