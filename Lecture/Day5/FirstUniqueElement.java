// class Solution {
//     public int firstUniqChar(String s) {
//         int n = s.length();
//         int[] arr = new int[26];
//         for (int i = 0; i < n; i++)
//             arr[s.charAt(i) - 'a']++;
//         for (int i = 0; i < n; i++)
//             if (arr[s.charAt(i) - 'a'] == 1)
//                 return i;
//         return -1;
//     }
// }
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character a : s.toCharArray())
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        for (int i = 0; i < s.length(); i++)
            if (mp.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }
}