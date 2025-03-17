import java.util.*;

public class UltraFastMatheMatician {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] input = sc.nextLine().split(" ");
            String a = input[0];
            String b = input[1];
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < a.length(); i++)
                result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
            System.out.println(result);
        }
    }
}
