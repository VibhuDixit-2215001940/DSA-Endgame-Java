class Solution {
    public boolean increasingTriplet(int[] arr) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, n = arr.length;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            if (a >= x)
                a = x;
            else if (b >= x)
                b = x;
            else
                return true;
        }
        return false;
    }
}