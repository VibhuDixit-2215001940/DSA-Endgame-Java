import java.util.*;

public class HarryVsDraco {
    static String determineWinner(int N, int P, int M, int X) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(P);
        visited.add(P);

        boolean isHarrysTurn = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int pos = queue.poll();

                // If we reach the target position, check whose turn it is
                if (pos == X) {
                    return isHarrysTurn ? "Gryffindor" : "Slytherin";
                }

                // Generate all possible new positions by reversing M coins
                for (int shift = -M + 1; shift <= 0; shift++) {
                    int newPos = pos + shift;
                    if (newPos >= 1 && newPos + M - 1 <= N && !visited.contains(newPos)) {
                        queue.add(newPos);
                        visited.add(newPos);
                    }
                }
            }
            isHarrysTurn = !isHarrysTurn; // Alternate turns
        }

        return "Draw";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        System.out.println(determineWinner(N, P, M, X));
        sc.close();
    }
}
