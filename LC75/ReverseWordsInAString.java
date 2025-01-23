class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            str.append(arr[i]);
            if (i != 0)
                str.append(" ");
        }
        return str.toString();
    }
}