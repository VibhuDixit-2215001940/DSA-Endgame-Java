import java.util.*;

public class NumberToString {
    static List<String> result = new ArrayList<>();

    // Recursive function to generate all possible strings
    static void generateStrings(String num, int index, StringBuilder current) {
        if (index == num.length()) {
            result.add(current.toString());
            return;
        }

        // Take one digit
        int oneDigit = num.charAt(index) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            current.append((char) ('A' + oneDigit - 1));
            generateStrings(num, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }

        // Take two digits (if within bounds)
        if (index + 1 < num.length()) {
            int twoDigits = Integer.parseInt(num.substring(index, index + 2));
            if (twoDigits >= 10 && twoDigits <= 26) {
                current.append((char) ('A' + twoDigits - 1));
                generateStrings(num, index + 2, current);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        result.clear();

        generateStrings(num, 0, new StringBuilder());

        Collections.sort(result); // Ensure sorted order
        for (String str : result) {
            System.out.println(str);
        }

        sc.close();
    }
}
