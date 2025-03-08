import java.util.*;

public class AlexGoesShoping {
    public static boolean check(int[] item, int a, int b) {
        int count = 0;
        for (int i = 0; i < item.length; i++) {
            if (a % item[i] == 0)
                count++;
            if (count >= b)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] item = new int[n];
        for (int i = 0; i < n; i++) {
            item[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (check(item, a, b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// Sample Input
// 4
// 100 200 400 100
// 6
// 100 2
// 200 3
// 500 4
// 600 4
// 800 4
// 1200 1
// Sample Output
// Yes
// Yes
// No
// No
// Yes
// Yes