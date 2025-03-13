class Solution {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> ll = new ArrayList<>();
        while (temp != null) {
            ll.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int n = ll.size();
        for (int i = 0; i < n / 2; i++) {
            temp.val = ll.get(i);
            temp = temp.next;
            temp.val = ll.get(n - i - 1);
            temp = temp.next;
        }
        if (n % 2 == 1) {// Handle the middle node for odd-length lists
            temp.val = ll.get(n / 2);
        }
    }
}