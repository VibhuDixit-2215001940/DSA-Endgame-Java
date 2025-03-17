import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n], maxXor = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= arr[j];
                maxXor = Math.max(maxXor, xor);
            }
        }
        System.out.println(maxXor);
    }
}
