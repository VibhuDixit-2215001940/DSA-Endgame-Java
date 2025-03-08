import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int xor = 0;
        for (int num : arr)
            xor ^= num;
        int rightmostSetBit = xor & -xor;
        int num1 = 0, num2 = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) != 0)
                num1 ^= num;
            else
                num2 ^= num;
        }
        if (num1 < num2)
            System.out.println(num1 + " " + num2);
        else
            System.out.println(num2 + " " + num1);
    }
}
// Sample Input
// 4
// 3 1 2 1
// Sample Output
// 2 3