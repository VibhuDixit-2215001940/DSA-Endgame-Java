import java.util.Scanner;

public class Fact {
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1; // Factorial of 0 or 1 is 1
        return n * fact(n - 1); // Recursive factorial calculation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + fact(n));
        sc.close();
    }
}
