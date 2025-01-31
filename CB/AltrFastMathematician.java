import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                result.append(str1.charAt(i) == str2.charAt(i) ? '0' : '1');
            }

            System.out.println(result.toString());
        }
        sc.close();
    }
}
// Sample Input
// 1
// 10111 10000
// Sample Output
// 00111