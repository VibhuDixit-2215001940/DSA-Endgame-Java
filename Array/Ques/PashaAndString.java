// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int n = s.length();
//         int m = sc.nextInt();
//         int[] operations = new int[m];
//         for (int i = 0; i < m; i++)
//             operations[i] = sc.nextInt();
//         int[] flipCount = new int[n / 2 + 1];
//         for (int op : operations)
//             flipCount[op]++;
//         boolean flip = false;
//         char[] charArray = s.toCharArray();
//         for (int i = 1; i <= n / 2; i++) {
//             flip ^= (flipCount[i] % 2 == 1);
//             if (flip) {
//                 char temp = charArray[i - 1];
//                 charArray[i - 1] = charArray[n - i];
//                 charArray[n - i] = temp;
//             }
//         }
//         System.out.println(new String(charArray));
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int m = sc.nextInt();
        int[] transformations = new int[m];
        for (int i = 0; i < m; i++)
            transformations[i] = sc.nextInt();
        int[] toggle = new int[n + 1];
        for (int a : transformations) {
            toggle[a - 1]++;
            toggle[n - a]++;
        }
        int[] prefixSum = new int[n];
        prefixSum[0] = toggle[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + toggle[i];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (prefixSum[i] % 2 != 0) {
                char temp = charArray[i];
                charArray[i] = charArray[n - i - 1];
                charArray[n - i - 1] = temp;
            }
        }
        System.out.println(new String(charArray));
    }
}
