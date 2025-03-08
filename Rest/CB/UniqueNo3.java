import java.util.*;

public class UniqueNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ones = 0, twos = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        System.out.println(ones);
    }
}
// Sample Input
// 7
// 1 1 1 2 2 2 3
// Sample Output
// 3