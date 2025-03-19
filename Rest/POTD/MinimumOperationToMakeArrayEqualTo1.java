class Solution {
    public int minOperations(int[] arr) {
        int n=arr.length,count=0;
        for(int i=0;i<n-2;i++){
            if(arr[i] == 0){
                count++;
                arr[i] ^= 1;
                arr[i+1] ^= 1;
                arr[i+2] ^= 1;
            }
        }
        return (arr[n-2]==1 && arr[n-1]==1)?count:-1;
    }
}