class Solution {
    public int minFlips(int a, int b, int c) {
        return Integer.bitCount(((a | b) ^ c)) + Integer.bitCount((a & b) & ((a | b) ^ c));
    }
}

class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        for (int i = 0; i < 32; i++) { // Iterate through each bit position
            int bitA = (a >> i) & 1; // Extract ith bit of a
            int bitB = (b >> i) & 1; // Extract ith bit of b
            int bitC = (c >> i) & 1; // Extract ith bit of c
            if (bitC == 1) {
                if (bitA == 0 && bitB == 0)
                    flips++;
            } else
                flips += bitA + bitB;
        }
        return flips;
    }
}