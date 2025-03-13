class Solution {
    // Reverse Linked List Function
    public ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode last = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode reversed = reverseLL(slow);

        // Step 3: Compare the first and second halves
        ListNode first = head, second = reversed;
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }
}
