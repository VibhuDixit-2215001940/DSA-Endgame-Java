class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26]; // Only 26 letters in lowercase English alphabet
        int n = s.length();
        int max = -1, min = Integer.MAX_VALUE;

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        // Find the maximum odd frequency
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0 && arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the minimum even frequency
        boolean foundEven = false;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) { // Ensure frequency > 0
                min = Math.min(min, arr[i]);
                foundEven = true;
            }
        }

        // If no even frequency was found, return -1 as the problem statement might
        // require.
        if (!foundEven || max == -1)
            return -1;

        return max - min;
    }
}
