import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unique = 0;
        for (int i = 0; i < n; i++)
            unique ^= sc.nextInt();
        System.out.println(unique);
    }
}
// Sample Input
// 7
// 1 1 2 2 3 3 4
// Sample Output
// 4