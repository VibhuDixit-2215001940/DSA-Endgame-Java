import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void sieve(int n) {
        int[] isPrime = new int[n + 1];
        Arrays.fill(isPrime, 1);

        isPrime[0] = isPrime[1] = 0; // 0 and 1 are not prime

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = 0;
                }
            }
        }

        // Printing all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; // Find primes up to n
        System.out.println("Prime numbers up to " + n + ":");
        sieve(n);
    }
}
