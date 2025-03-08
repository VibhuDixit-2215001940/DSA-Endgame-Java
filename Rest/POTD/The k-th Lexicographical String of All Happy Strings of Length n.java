class Solution {
    public String getHappyString(int n, int k) {
        int total = 3 * (int) Math.pow(2, n - 1);
        if (k > total)
            return ""; // If k is greater than total possible happy strings, return empty string.
        int whichOne = (k - 1) / (total / 3); // Determine which group (starting character).
        int index = (k - 1) % (total / 3); // Determine position within that group.
        char firstChar = (whichOne == 0) ? 'a' : (whichOne == 1) ? 'b' : 'c';
        StringBuilder sb = new StringBuilder();
        sb.append(firstChar);
        for (int i = 1; i < n; i++) {
            int mid = (int) Math.pow(2, (n - i - 1));
            char prev = sb.charAt(i - 1);
            if (index < mid)
                sb.append(prev == 'a' ? 'b' : 'a');
            else {
                sb.append(prev == 'c' ? 'b' : 'c');
                index -= mid;
            }
        }
        return sb.toString();
    }
}
