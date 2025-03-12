class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: Find the length of the list
        ListNode curr = head;
        int L = 0;
        while (curr != null) {
            L++;
            curr = curr.next;
        }

        // Step 2: Calculate the base size of each part and the remainder
        int eachBucketNodes = L / k;
        int remainderNodes = L % k;

        // Step 3: Create an array to hold the resulting ListNode parts
        ListNode[] result = new ListNode[k];

        // Step 4: Reinitialize `curr` to the head of the list
        curr = head;
        ListNode prev = null;

        // Step 5: Loop over k parts
        for (int i = 0; curr != null && i < k; i++) {
            result[i] = curr;

            // Step 6: Loop over the nodes in the current part
            for (int count = 1; count <= eachBucketNodes + (remainderNodes > 0 ? 1 : 0); count++) {
                prev = curr;
                curr = curr.next;
            }

            // Step 7: Break the connection after the current part
            if (prev != null) {
                prev.next = null;
            }

            // Step 8: Decrease the remainder count
            remainderNodes--;
        }

        return result;
    }
}