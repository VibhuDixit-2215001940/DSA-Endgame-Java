class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[queries.length];
        int[] ball = new int[limit + 1];
        for (int i = 0; i < queries.length; i++) {
            int newball = queries[i][0];
            int col = queries[i][1];
            if (ball[newball] != 0) {
                int prev = ball[newball];
                hm.put(prev, hm.getOrDefault(prev, 0) - 1);
                if (hm.get(prev) == 0) {
                    hm.remove(prev);
                }
            }
            ball[newball] = col;
            hm.put(col, hm.getOrDefault(col, 0) + 1);
            res[i] = hm.size();
        }
        return res;
    }
}