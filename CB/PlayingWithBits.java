import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int totalSetBits = 0;
            for (int i = a; i <= b; i++) {
                totalSetBits += Integer.bitCount(i);
            }
            System.out.println(totalSetBits);
        }
    }
}
// Sample Input
// 2
// 1 1
// 10 15
// Sample Output
// 1
// 17