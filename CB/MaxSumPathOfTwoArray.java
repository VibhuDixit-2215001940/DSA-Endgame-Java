import java.util.*;

public class MaxSumPathOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of first array
            int m = sc.nextInt(); // Size of second array

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++)
                arr1[i] = sc.nextInt();
            for (int i = 0; i < m; i++)
                arr2[i] = sc.nextInt();

            System.out.println(maxSumPath(arr1, arr2, n, m));
        }

        sc.close();
    }

    public static int maxSumPath(int[] arr1, int[] arr2, int n, int m) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                // Common element found, take max of both paths and reset
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < n)
            sum1 += arr1[i++];
        while (j < m)
            sum2 += arr2[j++];

        // Add the final max sum
        result += Math.max(sum1, sum2);

        return result;
    }
}
