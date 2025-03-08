import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }

    public static int searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target)
                    return 1;
            }
        }
        return 0;
    }
}
// Sample Input
// 3 3
// 3 30 38
// 44 52 54
// 57 60 69
// 62
// Sample Output
// 0