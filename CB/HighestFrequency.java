import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        // Read input
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort the array

        int ele = arr[0], count = 1, maxCount = 1, maxEle = arr[0];

        // Traverse sorted array to count frequencies
        for (int i = 1; i < t; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for new element
            }

            if (count > maxCount) {
                maxCount = count;
                maxEle = arr[i];
            }
        }

        System.out.println(maxEle);
        sc.close();
    }
}
