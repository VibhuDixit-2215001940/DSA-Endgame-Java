class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftmax = nums[0]; // max value in left part of the array
        int max = nums[0]; // absolute max value in the already traversed part of the array
        int length = 1; // minimum length is 1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < leftmax) { // if current element is less than the max value in left part of the array
                length = i + 1; // increase length by 1 ie extend left array to index i
                leftmax = max; // assign the absolute max value to left max because we may have already
                               // traversed past a value greater than leftmax but assumed it was in the right
                               // part!! luckily we are storing it in the max variable
            } else {
                max = Math.max(nums[i], max); // update absolute max & stop left there
            }
        }
        return length; // don't add 1 here as it's possible it will never get updated in the for loop
                       // and will return a value of 2 instead of expected 1!
    }
}