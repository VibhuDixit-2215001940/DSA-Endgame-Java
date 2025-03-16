public class SetBit {
    public static void main(String[] args) {
        int n = 84;
        int idx = 4;
        System.out.println(isSet(n, idx));
    }

    public static boolean isSet(int n, int idx) {
        int mask = (1 << idx);
        if ((n & mask) != 0)
            return true;
        else
            return false;
    }
}
