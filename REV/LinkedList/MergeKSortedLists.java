import java.util.*;

class Solution {
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val <= l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode partitionAndMerge(int s, int e, ListNode[] lists) {
        if (s == e)
            return lists[s];
        if (s > e)
            return null;
        int mid = s + (e - s) / 2;
        ListNode l1 = partitionAndMerge(s, mid, lists);
        ListNode l2 = partitionAndMerge(mid + 1, e, lists);
        return mergeTwoSortedLists(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0)
            return null;
        return partitionAndMerge(0, n - 1, lists);
    }
}
