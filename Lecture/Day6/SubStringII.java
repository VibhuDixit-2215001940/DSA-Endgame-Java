public class SubStringII {
    public static void subString(String str) {
        int n = str.length();
        for (int len = 1; len <= n; len++) {
            for (int j = len; j <= n; j++) {
                int i = j - len;
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        subString(str);
    }
}
// h
// e
// l
// l
// o
// he
// el
// ll
// lo
// hel
// ell
// llo
// hell
// ello
// hello