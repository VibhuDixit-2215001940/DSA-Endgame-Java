import java.util.Scanner;

public class HeadRecusrionFact {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1; // Base case: Factorial of 0 or 1 is 1
        return n * factorial(n - 1); // Head recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();
    }
}

// Head Recursion:

// In head recursion, the recursive call happens before any processing.
// The factorial(n - 1) is evaluated first, and its result is multiplied by n
// during the return phase.