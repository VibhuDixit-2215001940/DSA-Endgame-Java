package Type2;

import java.util.*;

public class PriparingOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        count(arr, l, r, x);
    }

    public static void count(int[] arr, int l, int r, int x) {
        int n = arr.length, count = 0;
        for (int i = 0; i < (1 << n); i++) {
            if (Integer.bitCount(i) >= 2 && isItPossible(arr, l, r, x, i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isItPossible(int[] arr, int l, int r, int x, int i) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, pos = 0;
        while (i > 0) {
            if ((i & 1) != 0) {
                sum += arr[pos];
                min = Math.min(min, arr[pos]);
                max = Math.max(max, arr[pos]);
            }
            i >>= 1;
            pos++;
        }
        return sum >= l && sum <= r && max - min >= x;
    }
}