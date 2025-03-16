package Basics;

public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(check(n));
    }

    public static boolean check(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
