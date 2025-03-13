class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp = head.next; // Skip the first zero
        int sum = 0;
        while (temp != null) {
            if (temp.val == 0) {
                if (sum > 0) {
                    // Add a new node with the sum to the result list
                    curr.next = new ListNode(sum);
                    curr = curr.next;
                    sum = 0; // Reset the sum for the next segment
                }
            } else
                sum += temp.val;
            temp = temp.next;
        }
        return dummy.next; // Return the merged list
    }
}
