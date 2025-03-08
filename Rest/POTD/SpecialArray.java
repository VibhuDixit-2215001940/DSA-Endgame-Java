class Solution {
    public boolean isArraySpecial(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean a = arr[i] % 2 == 0;
            boolean b = arr[i + 1] % 2 == 0;
            if (a == b)
                return false;
        }
        return true;
    }
}