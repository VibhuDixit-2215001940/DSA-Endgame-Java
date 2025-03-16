class Solution {
    public int missingNumber(int[] arr) {
        int ans = 0, n = arr.length;
        for (int i = 1; i <= n; i++)
            ans ^= i;
        for (int i = 0; i < n; i++)
            ans ^= arr[i];
        return ans;
    }
}