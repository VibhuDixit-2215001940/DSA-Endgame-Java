import java.util.*;

public class Main {

    // Recursive function to calculate the maximum value Piyush can achieve
    public static int maxValue(int[] arr, int i, int j) {
        if (i > j) {
            return 0; // No coins left
        }

        // Piyush chooses the first coin or the last coin
        // After his choice, the opponent (Nimit) will play optimally and leave Piyush
        // with the minimum possible value
        int takeFirst = arr[i] + minValue(arr, i + 1, j);
        int takeLast = arr[j] + minValue(arr, i, j - 1);

        // Return the maximum of both choices
        return Math.max(takeFirst, takeLast);
    }

    // Recursive function to calculate the minimum value the opponent (Nimit) can
    // leave for Piyush
    public static int minValue(int[] arr, int i, int j) {
        if (i > j) {
            return 0; // No coins left
        }

        // Nimit chooses the first coin or the last coin
        // After his choice, Piyush will play optimally and maximize his score
        int takeFirst = maxValue(arr, i + 1, j);
        int takeLast = maxValue(arr, i, j - 1);

        // Return the minimum of both choices, because Nimit is playing optimally to
        // minimize Piyush's score
        return Math.min(takeFirst, takeLast);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input reading
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output the result from the recursive function
        System.out.println(maxValue(arr, 0, n - 1));

        sc.close();
    }
}
