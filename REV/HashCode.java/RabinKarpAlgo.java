import java.util.*;

public class RabinKarpAlgo {
    static final int P = 31;
    static final int MOD = 1_000_000_007;
    static long[] hash, power;

    public static void main(String[] args) {
        String str = "apple";
        precomputeHash(str);
        System.out.println(getHash(0, str.length() - 1)); // 4990970
        System.out.println(str.hashCode()); // 93029210
    }

    public static void precomputeHash(String str) {
        int n = str.length();
        hash = new long[n];
        power = new long[n];

        power[0] = 1;
        hash[0] = (str.charAt(0) - 'a' + 1);

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * P) % MOD;
            hash[i] = (hash[i - 1] + (str.charAt(i) - 'a' + 1) * power[i]) % MOD;
        }
    }

    public static long getHash(int l, int r) {
        if (l == 0)
            return hash[r];
        return (hash[r] - hash[l - 1] + MOD) % MOD;
    }
}
