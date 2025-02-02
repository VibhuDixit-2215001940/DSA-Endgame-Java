import java.util.Scanner;

public class SubSequence {
    public static void printSubSequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        printSubSequence(str.substring(1), ans);
        printSubSequence(str.substring(1), ans + ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSubSequence("abc", "");
    }
}
// c
// b
// bc
// a
// ac
// ab
// abc