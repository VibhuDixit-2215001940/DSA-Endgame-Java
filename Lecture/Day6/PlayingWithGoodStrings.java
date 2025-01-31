import java.util.*;

public class PlayingWithGoodStrings {
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxLen = 0, currLen = 0;

        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 0;
            }
        }

        System.out.println(maxLen);
    }
}
// https://codeskiller.codingblocks.com/problems/549