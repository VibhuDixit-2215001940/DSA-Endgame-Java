//TLE 
class Solution {
    public static int[] addX(int n, int arr[], int x) {
        int[] brr = new int[n - 1];
        brr[0] = x;
        for (int i = 1; i < n - 1; i++)
            brr[i] = arr[i + 1];
        return brr;
    }

    public int minOperations(int[] arr, int k) {
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        while (n > 1 && arr[0] < k) {
            int x = arr[0] * 2 + arr[1];
            arr = addX(n, arr, x);
            n--;
            count++;
            Arrays.sort(arr);
        }
        return (arr[0] >= k) ? count : -1;
    }
}
