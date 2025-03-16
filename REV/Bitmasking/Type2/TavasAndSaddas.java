package Type2;

import java.util.Scanner;

public class TavasAndSaddas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Index(s));
    }

    public static int Index(String s) {
        int n = s.length(), pos = 0;
        int count = (1 << n) - 2;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '7')
                count += (1 << pos);
            pos++;
        }
        return count + 1;
    }
}