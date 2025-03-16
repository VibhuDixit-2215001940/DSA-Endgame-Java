public class CountSetBits {
    public static void main(String[] args) {
        int n = 5, count = 0;
        // ------------------------------------------
        // System.out.println(Integer.bitCount(n));// 2
        // ------------------------------------------
        // while (n > 0) {
        // if ((n & 1) != 0)
        // count++;
        // n = n >> 1;
        // }
        // System.out.println(count);// 2
        // ------------------------------------------
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }
        System.out.println(count);// 2
    }
}
