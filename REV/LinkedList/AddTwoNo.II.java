class Solution {

    // Helper function to reverse a linked list
    public ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: If list is empty or has one node, return as is
        }

        ListNode last = reverseLL(head.next); // Recursive call to reverse the rest of the list
        head.next.next = head; // Reverse the current node
        head.next = null; // Set the next pointer to null to avoid cycles
        return last; // Return the new head of the reversed list
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Reverse both input linked lists
        l1 = reverseLL(l1);
        l2 = reverseLL(l2);

        int sum = 0, carry = 0;

        // Dummy node to simplify result list construction
        ListNode ans = new ListNode(0);

        // Step 2: Traverse both lists and calculate the sum
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Step 3: Store the current digit and update the carry
            ans.val = sum % 10;
            carry = sum / 10;

            // Step 4: Create a new node for the next digit and insert it at the front
            ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;

            // Prepare sum for the next iteration (set to carry)
            sum = carry;
        }

        // Step 5: Return the correct head (skip leading zero if no carry remains)
        return carry == 0 ? ans.next : ans;
    }
}
