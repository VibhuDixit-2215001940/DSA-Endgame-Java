import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        // Step 1: Convert linked list to a StringBuilder
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        // Step 2: Double the value using BigInteger
        BigInteger num = new BigInteger(sb.toString()).multiply(BigInteger.TWO);

        // Step 3: Convert the doubled value back to a linked list
        return intToLinkedList(num.toString());
    }

    public ListNode intToLinkedList(String num) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (char ch : num.toCharArray()) {
            current.next = new ListNode(ch - '0');
            current = current.next;
        }

        return dummy.next;
    }
}
