class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int even = palindromeCount(s, i, i + 1);
            int odd = palindromeCount(s, i - 1, i + 1);
            ans += even + odd + 1;
        }
        return ans;
    }

    public int palindromeCount(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
            count++;
        }
        return count;
    }
}
// TC : O(n^3)
// class Solution {
// public boolean ok(String s,int l,int r){
// while(l<r){
// if(s.charAt(l++) != s.charAt(r--)) return false;
// }
// return true;
// }
// public int countSubstrings(String s) {
// int n = s.length(),ans = 0;
// for(int i=0;i<n;i++){
// for(int j=i;j<n;j++){
// if(ok(s,i,j)) ans++;
// }
// }
// return ans;
// }
// }