class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head, second = head, temp = head;
        int n = 0;

        // Calculate length of the list
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        // Move `first` to k-th node from the start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Move `second` to k-th node from the end
        temp = head;
        for (int i = 1; i <= n - k; i++) {
            second = second.next;
        }

        // Swap the values of the two nodes
        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}
