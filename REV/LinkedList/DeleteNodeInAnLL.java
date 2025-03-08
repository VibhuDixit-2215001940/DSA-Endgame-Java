class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null)
            return; // Edge case: last node can't be deleted this
        node.val = node.next.val; // Copy next node's value
        node.next = node.next.next; // Skip the next node, effectively deleting it
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node != null && node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        if (node != null) {// Means list is not empty
            if (prev != null)
                prev.next = null;
            else
                node = null;// Means list has only one node
        }
    }
}