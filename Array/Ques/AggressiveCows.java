import java.util.*;

public class AggressiveCows {

    // Function to check if we can place cows with a minimum distance `dist`
    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int cntCows = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++;
                last = stalls[i];
            }
            if (cntCows >= cows) {
                return true;
            }
        }
        return false;
    }

    // Function to find the largest minimum distance
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1, high = stalls[n - 1] - stalls[0], result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k)) {
                result = mid; // Update result
                low = mid + 1; // Try for a larger minimum distance
            } else {
                high = mid - 1; // Try for a smaller minimum distance
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = { 1, 2, 8, 4, 9 }; // Example stalls
        int k = 3; // Number of cows
        System.out.println("Largest minimum distance: " + aggressiveCows(stalls, k));// 3
    }
}
