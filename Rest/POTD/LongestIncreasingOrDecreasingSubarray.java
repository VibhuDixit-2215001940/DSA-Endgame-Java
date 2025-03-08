class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int ans = 1;
        int increasing=1,decreasing=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                increasing++;
                decreasing=1;
            }
            else if(arr[i]<arr[i-1]){
                increasing=1;
                decreasing++;
            }
            else{
                increasing=1;
                decreasing=1;
            }
            ans = Math.max(ans,Math.max(decreasing,increasing));
        }
        return ans;
    }
}