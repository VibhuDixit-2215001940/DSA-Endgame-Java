package Basics;

public class KthBitSetOrNot {
    public static void main(String[] args) {
        int n = 4; // Binary: 100
        int k = 3; // Check if the 3rd bit (1-based) is set
        System.out.println(check(n, k)); // Output: true
    }

    public static boolean check(int n, int k) {
        return (n & (1 << (k - 1))) != 0;
    }
}