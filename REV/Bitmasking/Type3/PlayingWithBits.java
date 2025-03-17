import java.util.*;

public class PlayingWithBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), count = 0;
            for (int i = a; i <= b; i++)
                count += Integer.bitCount(i);
            System.out.println(count);
        }
        sc.close();
    }
}
