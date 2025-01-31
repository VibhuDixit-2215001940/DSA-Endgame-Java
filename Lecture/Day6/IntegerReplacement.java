//COLLATZ CONJECTURE THEOREM
public class IntegerReplacement {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(integerReplacement(n)); // Output: 3
    }

    public static int integerReplacement(int n) {
        long x = n;
        int count = 0;
        while (x != 1) {
            if (x % 2 == 0)
                x /= 2;
            else {
                if (x == 3 || (x & 2) == 0)
                    x--;
                else
                    x++;
            }
            count++;
        }
        return count;
    }
}

// Given a
// positive integer n,
// you can
// apply one
// of the
// following operations:

// If n
// is even, replace
// n with n/2.
// If n
// is odd, replace
// n with
// either n+1
// or n-1.
// Return the
// minimum number
// of operations needed for
// n to become
// 1.

// Example 1:

// Input: n = 8
// Output: 3
// Explanation: 8 -> 4 -> 2 -> 1
// Example 2:

// Input: n = 7
// Output: 4
// Explanation: 7 -> 8 -> 4 -> 2 -> 1
// or 7 -> 6 -> 3 -> 2 -> 1
// Example 3:

// Input: n = 4
// Output: 2
