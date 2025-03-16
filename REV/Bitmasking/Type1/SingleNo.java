class Solution {
    public int singleNumber(int[] arr) {
        int x = 0;
        for (int y : arr)
            x ^= y;
        return x;
    }
}