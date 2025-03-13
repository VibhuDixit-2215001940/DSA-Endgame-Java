import java.util.*;

class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Store the values of the linked list in an ArrayList
        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Traverse from the right and keep the maximum elements
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        for (int i = values.size() - 1; i >= 0; i--) {
            if (values.get(i) >= maxRight) {
                result.add(values.get(i)); // Keep the value if it's >= maxRight
                maxRight = values.get(i);
            }
        }

        // Step 3: Reconstruct the linked list from the result
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Since result is in reverse order, add values in reverse
        for (int i = result.size() - 1; i >= 0; i--) {
            curr.next = new ListNode(result.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}
