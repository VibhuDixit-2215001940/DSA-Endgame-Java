
import java.util.Scanner;

public class PrintDecreasing {
    public static void ok(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        ok(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ok(n);
    }
}
