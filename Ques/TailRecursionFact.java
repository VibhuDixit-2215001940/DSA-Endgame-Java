import java.util.Scanner;

public class TailRecursionFact {
    public static int factorial(int n, int result) {
        if (n == 0 || n == 1)
            return result; // Base case: Return the accumulated result
        return factorial(n - 1, n * result); // Tail recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n, 1));
        sc.close();
    }
}
