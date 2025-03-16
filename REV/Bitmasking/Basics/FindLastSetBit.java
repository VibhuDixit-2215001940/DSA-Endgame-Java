package Basics;

public class FindLastSetBit {
    public static void main(String[] args) {
        int n = 10;
        int lastBit = findLastSetBit(n);
        System.out.println(lastBit);
    }

    public static int findLastSetBit(int n) {
        if (n == 0)
            return 0; // No set bit in 0
        return (int) (Math.log(n & -n) / Math.log(2)) + 1;
    }
}
