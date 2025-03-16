public class MagicNo {
    public static void main(String[] args) {
        int n = 5;
        nth_no(n);
    }

    public static void nth_no(int n) {
        int mul = 5;
        int sum = 0;
        while (n > 0) {
            sum = sum + mul;
            mul = mul * 5;
            n--;
        }
    }
}
