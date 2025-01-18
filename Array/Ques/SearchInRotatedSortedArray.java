class Solution {
    public int pivotIndex(int[] arr, int l, int r) {
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[r])
                l = mid + 1;
            else
                r = mid;
        }
        return r;
    }

    public int binarySearch(int[] arr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public int search(int[] arr, int target) {
        int n = arr.length;
        int pivot_index = pivotIndex(arr, 0, n - 1);
        int idx = binarySearch(arr, 0, pivot_index - 1, target);
        if (idx != -1)
            return idx;
        idx = binarySearch(arr, pivot_index, n - 1, target);
        return idx;
    }
}