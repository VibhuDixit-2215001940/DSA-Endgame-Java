import java.util.Scanner;

public class PrintIncreasing {
    public static void ok(int n, int m) {
        if (n == m - 1)
            return;
        System.out.println(m);
        ok(n, m + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ok(n, 1);
    }
}
