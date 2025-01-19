import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++)
            heights[i] = sc.nextInt();
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];
        maxLeft[0] = heights[0];
        for (int i = 1; i < n; i++)
            maxLeft[i] = Math.max(maxLeft[i - 1], heights[i]);
        minRight[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--)
            minRight[i] = Math.min(minRight[i + 1], heights[i]);
        int blockCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (maxLeft[i] <= minRight[i + 1])
                blockCount++;
        }
        blockCount++;// last waale ke liye
        System.out.println(blockCount);
    }
}