import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), p = sc.next();
        int i = 0, j = 0;
        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j))
                i++;
            else
                j++;
        }
        System.out.println((i == s.length()) ? "true" : "false");
    }
}
// Example 1

// Input

// abc
// ahbgdc

// Output

// true