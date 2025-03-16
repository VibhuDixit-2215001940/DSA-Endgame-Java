import java.util.Scanner;

public class EhabTheExorcist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt(), v = sc.nextInt();
        Xorcist(u, v);
    }

    public static void Xorcist(int u, int v) {
        if (u > v || u % 2 != v % 2) {
            System.out.println(-1);
        } else if (u == v) {
            if (u == 0)
                System.out.println(0);
            else {
                System.out.println(1);
                System.out.println(u);
            }
        } else {
            int x = (u - v) / 2;
            if ((u & x) == 0) {
                System.out.println(2);
                System.out.println((u + x) + " " + x);
            } else {
                System.out.println(3);
                System.out.println(u + " " + x + " " + x);
            }
        }
    }
}