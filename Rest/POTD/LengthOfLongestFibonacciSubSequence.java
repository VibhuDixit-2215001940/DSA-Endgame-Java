class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, result = 0;
        int[][] dp = new int[n][n];
        for (int i = 2; i < n; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum > arr[i])
                    r--;
                else if (sum < arr[i])
                    l++;
                else {
                    dp[r][i] = dp[l][r] + 1;
                    result = Math.max(result, dp[r][i]);
                    l++;
                    r--;
                }
            }
        }
        if (result != 0)
            return result + 2;
        return 0;
    }
}