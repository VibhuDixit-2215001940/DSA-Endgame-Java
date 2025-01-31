import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of the array
        long[] arr = new long[n]; // Use long for array elements to handle large numbers

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong(); // Use long for input values
        }

        // Initialize the output array (long[] to handle large products)
        long[] output = new long[n];

        // Step 1: Compute the left products
        output[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * arr[i - 1];
        }

        // Step 2: Compute the right products and update the output array
        long rightProduct = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct; // Multiply with the right product
            rightProduct *= arr[i]; // Update the right product for the next iteration
        }

        // Step 3: Print the output array
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
