import java.util.*;

public class RussianDollEnvelopes {
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0)
            return 0;

        // Step 1: Sort envelopes
        Arrays.sort(envelopes, (a, b) -> (a[0] == b[0]) ? (b[1] - a[1]) : (a[0] - b[0]));

        // Step 2: Apply LIS on the heights
        List<Integer> dp = new ArrayList<>();
        for (int[] envelope : envelopes) {
            int height = envelope[1];
            int idx = Collections.binarySearch(dp, height);
            if (idx < 0)
                idx = -idx - 1;
            if (idx == dp.size())
                dp.add(height);
            else
                dp.set(idx, height);
        }
        return dp.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] envelopes = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                envelopes[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maxEnvelopes(envelopes));
        scanner.close();
    }
}
