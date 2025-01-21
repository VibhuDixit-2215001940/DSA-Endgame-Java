class Solution {
    public String mergeAlternately(String str1, String str2) {
        int i = 0,n=str1.length(),m=str2.length();
        StringBuilder sb = new StringBuilder();
        while(i<n || i<m){
            if(i<n) sb.append(str1.charAt(i));
            if(i<m) sb.append(str2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}