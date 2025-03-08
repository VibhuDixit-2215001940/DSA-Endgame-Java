import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }

        // Custom sorting
        words.sort((s1, s2) -> {
            if (s1.startsWith(s2))
                return -1; // s1 is longer, comes first
            if (s2.startsWith(s1))
                return 1; // s2 is longer, comes first
            return s1.compareTo(s2); // Normal lexicographic order
        });

        // Print sorted words
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
