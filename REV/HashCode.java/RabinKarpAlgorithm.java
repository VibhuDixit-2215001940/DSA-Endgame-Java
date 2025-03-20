public class RabinKarpAlgorithm {
    public static void main(String[] args) {
        String str = "apple";
        System.out.println(findHash(str));// 4990970
        // (1*31^0+16*31^1+16*31^2+12*31^3+5*31^4)mod1000000007
        System.out.println(str.hashCode());// 93029210 returns 32 bit no as no modulo operation in it
    }

    public static long findHash(String str) {
        int p = 31, pow = 1, mod = 1000_000_007;
        long hv = 0;
        for (int i = 0; i < str.length(); i++) {
            hv = (hv + (str.charAt(i) - 'a' + 1) * pow) % mod;
            pow = (pow * p) % mod;
        }
        return hv;
    }

}
