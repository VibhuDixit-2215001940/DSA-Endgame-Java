import java.util.Scanner;

public class FirstOccurInArray {
    public static int check(int[] arr, int i, int n, int target) {
        if (i == n)
            return -1;
        if (arr[i] == target)
            return i;
        return check(arr, i + 1, n, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(check(arr, 0, n, target));
    }
}
