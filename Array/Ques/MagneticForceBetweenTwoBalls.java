class Solution {
    public boolean isPossible(int[] arr, int dist, int k) {
        int count = 1, last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
            }
            if (count >= k)
                return true;
        }
        return false;
    }

    public int maxDistance(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length, l = 1, h = arr[n - 1] - arr[0], res = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isPossible(arr, mid, k)) {
                res = mid;
                l = mid + 1;
            } else
                h = mid - 1;
        }
        return res;
    }
}