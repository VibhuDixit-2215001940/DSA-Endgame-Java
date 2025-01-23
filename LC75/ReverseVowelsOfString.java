class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }

    public static void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (isVowel(ch[i]) && isVowel(ch[j])) {
                swap(ch, i, j);
                i++;
                j--;
            } else if (!isVowel(ch[i]))
                i++;
            else
                j--;
        }
        return new String(ch);
    }
}