import java.util.*;

public class AmusementPark {
    public static int maxRides(int N, int K, int[] tokens) {
        List<int[]> rides = new ArrayList<>();
        for (int i = 0; i < N; i++)
            rides.add(new int[] { tokens[i], N - i });
        rides.sort(Comparator.comparingInt(a -> a[0]));// Sort by token cost (ascending)
        int ridesTaken = 0;
        for (int[] ride : rides) {
            int cost = ride[0];
            int maxTimes = ride[1];
            if (K <= 0)
                break;
            int possibleTimes = Math.min(K / cost, maxTimes);
            ridesTaken += possibleTimes;
            K -= possibleTimes * cost;
        }
        return ridesTaken;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int[] tokens = new int[N];
        for (int i = 0; i < N; i++)
            tokens[i] = sc.nextInt();
        System.out.println(maxRides(N, K, tokens));
        sc.close();
    }
}
// Problem Explanation:
// There are N amusement rides, each requiring a certain number of tokens.
// The j-th ride requires tokens[j] per ride.
// The number of times a ride can be taken decreases from N to 1 (i.e., first
// ride at most N times, second ride at most N-1 times, ..., last ride at most 1
// time).
// We have K tokens to maximize the total rides.

// Approach:
// Understanding Constraints:

// N can be 10⁵ and K can be 10⁹, so an O(N * K) solution is inefficient.
// We need a greedy approach for efficiency.
// Sorting Strategy (Greedy Choice):

// Sort rides by increasing token cost.
// Process the rides greedily: Spend tokens on cheaper rides first since they
// allow more repetitions.
// Iterate Over Rides Efficiently:

// Keep track of how many times each ride can be taken.
// Deduct the cost from K and update the ride count.
// Optimized Time Complexity:

// Sorting takes O(N log N).
// Greedy selection takes O(N).
// Overall: O(N log N).
