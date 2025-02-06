public class FactorialUsingTailRecursion {
    public static int fact1(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact1(n - 1);// Head recursion as jab stack lot raha hai tab ans hamara calculate ho raha!!
        // Tail recursion is a form of recursion where the recursive call is the last
        // operation performed in the function.
    }

    public static int fact2(int n, int ans) {
        if (n == 0)
            return ans;
        return fact2(n - 1, n * ans); // Tail recursion as jab stack ban raha hai tab ans hamara calculate ho raha!!
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact1(a));
        System.out.println(fact2(a, 1));
    }
}
