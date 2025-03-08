import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Read input prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Compute stock span
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println("END");

        sc.close();
    }
}
// Sample Input
// 5
// 30
// 35
// 40
// 38
// 35
// Sample Output
// 1 2 3 1 1 END