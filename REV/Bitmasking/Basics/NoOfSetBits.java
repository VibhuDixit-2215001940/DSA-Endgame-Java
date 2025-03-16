package Basics;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.bitCount(n));
        System.out.println(count(n));
    }

    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
