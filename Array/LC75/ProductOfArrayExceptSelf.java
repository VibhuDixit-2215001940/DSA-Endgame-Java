class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++)
            l[i] = l[i - 1] * arr[i - 1];
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            l[i] *= r;
            r *= arr[i];
        }
        return l;
    }
}