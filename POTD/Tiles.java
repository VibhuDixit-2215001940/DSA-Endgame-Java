class Solution {
    public int numTilePossibilities(String s) {
        Set<String> resultSet = new HashSet<>();
        for (int l = 1; l <= s.length(); l++) permute(s, l, "", resultSet);
        return resultSet.size();
    }
    private void permute(String s, int l, String current, Set<String> resultSet) {
        if (current.length() == l) {
            resultSet.add(current);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permute(s.substring(0, i) + s.substring(i + 1), l, current + s.charAt(i), resultSet);
        }
    }
}
