import java.util.*;

public class Main {
    public static int maxConsecutive1(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0, maxLength = 0, zeroCount = 0;
        while (right < n) {
            if (arr[right] == 0)
                zeroCount++;
            while (zeroCount > k) {
                if (arr[left] == 0)
                    zeroCount--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(maxConsecutive1(arr, k));
    }

}