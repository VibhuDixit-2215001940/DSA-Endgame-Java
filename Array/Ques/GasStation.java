class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // n represents the total number of gas stations
        int n = gas.length;

        // Initialize index pointers for the circular route
        int start = n - 1; // Start from the last station
        int end = n - 1; // End at the last station initially

        // Initialize a sum to keep track of the remaining gas and count of stations
        // checked
        int sum = 0;
        int stationsChecked = 0;

        // Iterate until we've checked all stations
        while (stationsChecked < n) {
            // Calculate the remaining gas after visiting a station
            sum += gas[end] - cost[end];
            stationsChecked++; // Increment the number of stations checked
            end = (end + 1) % n; // Move to the next station circularly

            // If we have a deficit (sum < 0), try starting from an earlier station
            while (sum < 0 && stationsChecked < n) {
                start--; // Decrement start index to check an earlier station
                sum += gas[start] - cost[start]; // Update sum for the new start station
                stationsChecked++; // Increment the number of stations checked
            }
        }

        // If we have remaining gas (sum >= 0), return the starting station
        // Else, return -1 indicating the trip cannot be completed
        return sum >= 0 ? start : -1;
    }
}