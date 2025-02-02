// public class CountRecursion {
//     static int count = 0;

//     public static void toss(int n, String ans) {
//         if (n == 0) {
//             System.out.println(ans);
//             count++;
//             return;
//         }
//         toss(n - 1, ans + 'H');
//         toss(n - 1, ans + 'T');
//     }

//     public static void main(String[] args) {
//         toss(3, "");
//         System.out.println(count);
//     }
// }
// HHH
// HHT
// HTH
// HTT
// THH
// THT
// TTH
// TTT
public class CountRecursion {

    public static int toss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }
        int a = toss(n - 1, ans + 'H');
        int b = toss(n - 1, ans + 'T');
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(toss(3, ""));
    }
}