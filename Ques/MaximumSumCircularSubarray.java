import java.util.*;

class Solution {

    public int kadanesMax(int[] nums, int n) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public int kadanesMin(int[] nums, int n) {
        int sum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.min(sum + nums[i], nums[i]);
            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();

        int maxSum = kadanesMax(nums, n);
        int minSum = kadanesMin(nums, n);
        int circSum = totalSum - minSum;

        if (maxSum > 0) {
            return Math.max(maxSum, circSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, -2, 3, -2}; // Example input
        System.out.println("Maximum Circular Subarray Sum: " + solution.maxSubarraySumCircular(nums));
    }
}