import java.util.*;
class Solution {
    private List<Integer> arr;
    private Random rand;
    public Solution(ListNode head) {
        arr = new ArrayList<>();
        rand = new Random();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
    }
    public int getRandom() {
        int r_index = rand.nextInt(arr.size());
        return arr.get(r_index);
    }
}
