class Solution {
    public ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode last = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;
        if (head == null || left == right)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Traverse to the node before the 'left' position
        for (int i = 1; i < left; i++)
            prev = prev.next;

        // Step 2: Identify the start and end of the sublist
        ListNode start = prev.next; // First node to be reversed
        ListNode end = start;
        for (int i = left; i < right; i++)
            end = end.next;

        // Step 3: Disconnect the sublist and save the remaining part
        ListNode rest = end.next; // Nodes after the right position
        end.next = null; // Isolate the sublist

        // Step 4: Reverse the isolated sublist
        ListNode reversedSublist = reverseLL(start);

        // Step 5: Reconnect the reversed sublist
        prev.next = reversedSublist;
        start.next = rest;

        return dummy.next;
    }
}
