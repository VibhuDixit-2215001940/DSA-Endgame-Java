import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String luckyNumber = sc.next(); // Read lucky number as string
        int length = luckyNumber.length();

        // Compute the position of numbers with smaller lengths
        int index = (1 << length) - 2; // 2^(length) - 2

        // Convert the lucky number to binary (4 -> 0, 7 -> 1)
        int binaryValue = 0;
        for (char ch : luckyNumber.toCharArray()) {
            binaryValue = (binaryValue << 1) | (ch == '7' ? 1 : 0);
        }

        // Final index
        index += binaryValue + 1;
        System.out.println(index);

        sc.close();
    }
}
