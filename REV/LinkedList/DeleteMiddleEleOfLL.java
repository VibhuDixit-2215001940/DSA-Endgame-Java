class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int mid = 0;
        if (length % 2 == 0)
            mid = length / 2;
        else
            mid = (length - 1) / 2;
        ListNode prev = null, curr = head;
        for (int i = 0; i < mid; i++) {
            prev = curr;
            curr = curr.next;
        }
        if (prev != null)
            prev.next = curr.next;
        return head;
    }
}

// ------------------------------
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev == null)
            return null;
        prev.next = slow.next;
        return head;
    }
}