public class FiboNacciNo {
    public static int rec(int n) {
        if (n == 0 || n == 1)
            return n;
        return rec(n - 1) + rec(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(rec(n));
    }
}
