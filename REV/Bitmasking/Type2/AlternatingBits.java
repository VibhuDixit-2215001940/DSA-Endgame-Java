package Type2;

import java.util.*;

public class AlternatingBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = n + (n >> 1); // Sum of n and n/2
        System.out.println((check & (check + 1)) == 0 ? "True" : "False");
        sc.close();
    }
}
