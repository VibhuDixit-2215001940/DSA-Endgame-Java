class Solution {
    public double findMedianSortedArrays(int[] arr, int[] brr) {
        ArrayList<Integer> ll = new ArrayList<>();double temp;
        for(int i=0;i<arr.length;i++) ll.add(arr[i]);
        for(int j=0;j<brr.length;j++) ll.add(brr[j]);
        Collections.sort(ll);
        if(ll.size()%2 != 0){
            temp = ll.get(ll.size()/2);
            return temp;
        }
        else{
            temp = ll.get(ll.size()/2) + ll.get((ll.size()/2)-1);
            return temp/2;
        }
    }
}