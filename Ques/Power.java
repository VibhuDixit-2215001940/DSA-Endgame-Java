import java.util.Scanner;

public class Power {
    public static int pow(int n, int m) {
        if (m == 1)
            return n;
        return pow(n * n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(pow(n, m));
        sc.close();
    }
}
