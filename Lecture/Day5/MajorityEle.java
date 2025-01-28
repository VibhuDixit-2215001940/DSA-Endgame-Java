class Solution {
    public int majorityElement(int[] arr) {
        int count = 0, ele = -1;
        for (int x : arr) {
            if (count == 0)
                ele = x;
            if (x == ele)
                count++;
            else
                count--;
        }
        return ele;
    }
}