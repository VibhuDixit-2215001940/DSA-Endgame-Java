package Basics;

public class BitwiseModulo {
    public static void main(String[] args) {
        int n = 29, d = 6;
        System.out.println(modulo(n, d)); // Output: 29 % 6 = 5
    }

    public static int modulo(int n, int d) {
        if (d == 0)
            return -1; // Edge case: Division by zero

        if ((d & (d - 1)) == 0) {
            // If d is a power of 2, use bitwise AND trick
            return n & (d - 1);
        }

        // General case: Subtract d until n < d
        while (n >= d) {
            int highestPower = d;
            while ((highestPower << 1) <= n) {
                highestPower <<= 1; // Find highest multiple of d ≤ n
            }
            n -= highestPower; // Subtract the highest multiple
        }
        return n;
    }
}
