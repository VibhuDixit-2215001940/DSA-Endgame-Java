import java.util.*;

public class StringSubString {
    public static void PrintSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        PrintSubString(str);
    }
}
// h
// he
// hel
// hell
// hello
// e
// el
// ell
// ello
// l
// ll
// llo
// l
// lo
// o
