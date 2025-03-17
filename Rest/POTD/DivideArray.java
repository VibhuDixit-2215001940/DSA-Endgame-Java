class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];
        for(int x : nums) ++arr[x];
        return Arrays.stream(arr).allMatch(c->c%2==0);
    }
}