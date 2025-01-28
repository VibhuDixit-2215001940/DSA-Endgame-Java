class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false; // Negative numbers are not palindromes.

        int original = x; // Store the original number.
        int reversed = 0;

        // Reverse the number.
        while (x > 0) {
            int rem = x % 10; // Extract the last digit.
            reversed = reversed * 10 + rem; // Append the digit to reversed.
            x /= 10; // Remove the last digit from x.
        }

        // Compare the reversed number with the original.
        return original == reversed;
    }
}
