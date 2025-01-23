import java.util.Scanner;

public class LastOccurInArray {
    public static int check(int[] arr, int i, int n, int target, int lastIndex) {
        if (i == n)
            return lastIndex; // Base case: Return the last recorded index
        if (arr[i] == target)
            lastIndex = i; // Update last occurrence index if target matches
        return check(arr, i + 1, n, target, lastIndex); // Tail recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(check(arr, 0, n, target, -1));
        sc.close();
    }
}
