import java.util.*;

public class Main {
    static final int LIMIT = 1000000;
    static boolean[] isPrime = new boolean[LIMIT + 1];
    static int[] primeCount = new int[LIMIT + 1];

    // Sieve of Eratosthenes to precompute primes
    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= LIMIT; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Compute prefix sum of prime counts
        for (int i = 1; i <= LIMIT; i++) {
            primeCount[i] = primeCount[i - 1] + (isPrime[i] ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve(); // Precompute primes

        int testCases = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (testCases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result.append(primeCount[b] - primeCount[a - 1]).append("\n");
        }

        System.out.print(result);
        sc.close();
    }
}
