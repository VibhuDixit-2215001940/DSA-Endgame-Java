class Solution {
    public int minOperations(int[] arr, int k) {
        int ans = Arrays.stream(arr).reduce(0, (a, b) -> a ^ b);
        return Integer.bitCount(ans ^ k);
    }
}

class Solution {
    public int minOperations(int[] arr, int k) {
        int ans = 0;
        for (int x : arr)
            ans ^= x;
        return Integer.bitCount(ans ^ k);
    }
}