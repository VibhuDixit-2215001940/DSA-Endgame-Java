// class Solution {
//     public double findMedianSortedArrays(int[] arr, int[] brr) {
//         ArrayList<Integer> ll = new ArrayList<>();double temp;
//         for(int i=0;i<arr.length;i++) ll.add(arr[i]);
//         for(int j=0;j<brr.length;j++) ll.add(brr[j]);
//         Collections.sort(ll);
//         if(ll.size()%2 != 0){
//             temp = ll.get(ll.size()/2);
//             return temp;
//         }
//         else{
//             temp = ll.get(ll.size()/2) + ll.get((ll.size()/2)-1);
//             return temp/2;
//         }
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        while (low <= high) {
            int Px = low + (high - low) / 2;
            int Py = (m + n + 1) / 2 - Px;

            // Edge cases for nums1
            int x1 = (Px == 0) ? Integer.MIN_VALUE : nums1[Px - 1];
            int x3 = (Px == m) ? Integer.MAX_VALUE : nums1[Px];

            // Edge cases for nums2
            int x2 = (Py == 0) ? Integer.MIN_VALUE : nums2[Py - 1];
            int x4 = (Py == n) ? Integer.MAX_VALUE : nums2[Py];

            if (x1 <= x4 && x2 <= x3) {
                // Found the correct partition
                if ((m + n) % 2 == 0)
                    return (Math.max(x1, x2) + Math.min(x3, x4)) / 2.0;
                else
                    return Math.max(x1, x2);
            } else if (x1 > x4)
                high = Px - 1;
            else
                low = Px + 1;
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
