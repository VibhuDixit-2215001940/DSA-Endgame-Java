import java.util.Arrays;

public class CountBitTillN {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.bitCount(i);
        System.out.println(Arrays.toString(arr));// [0, 1, 1, 2, 1, 2, 2, 3, 1, 2]
    }
}
