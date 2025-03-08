import java.util.*;

public class PairOfRoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] roses = new int[n];

            for (int i = 0; i < n; i++) {
                roses[i] = sc.nextInt();
            }

            int x = sc.nextInt();
            Arrays.sort(roses);

            int left = 0, right = n - 1;
            int p = -1, q = -1;

            while (left < right) {
                int sum = roses[left] + roses[right];

                if (sum == x) {
                    p = roses[left];
                    q = roses[right];
                    left++; // Move left pointer
                    right--; // Move right pointer
                } else if (sum < x) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println("Deepak should buy roses whose prices are " + p + " and " + q + ".");
        }

        sc.close();
    }
}
