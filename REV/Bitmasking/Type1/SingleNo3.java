import java.util.Arrays;

public class SingleNo3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2, 5 };
        int[] result = singleNo(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] singleNo(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
            ans ^= arr[i];
        int mask = (ans & (~(ans - 1)));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) != 0)
                a ^= arr[i];
        }
        int b = ans ^ a;
        return new int[] { a, b };
    }
}
