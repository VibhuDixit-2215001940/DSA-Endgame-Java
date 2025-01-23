class Solution {
    private int[][] t;

    private boolean ok(String s, int l, int r) {
        if (l >= r)
            return true;
        if (t[l][r] != -1)
            return t[l][r] == 1;
        if (s.charAt(l) == s.charAt(r))
            t[l][r] = ok(s, l + 1, r - 1) ? 1 : 0;
        else
            t[l][r] = 0;
        return t[l][r] == 1;
    }

    public String longestPalindrome(String s) {
        int n = s.length(), maxlen = Integer.MIN_VALUE, startingIndex = 0;
        t = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(t[i], -1);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (ok(s, i, j) && j - i + 1 > maxlen) {
                    startingIndex = i;
                    maxlen = j - i + 1;
                }
            }
        }
        return s.substring(startingIndex, startingIndex + maxlen);
    }
}