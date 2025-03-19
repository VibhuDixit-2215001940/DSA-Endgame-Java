import java.util.*;

public class TournamentGames {
    public static List<Long> possibleTeams(long n) {
        List<Long> results = new ArrayList<>();

        for (long x = 1; x <= n; x++) {
            long games = 0, teams = x;

            // Simulating the tournament rounds
            while (teams >= 2) {
                long roundGames = teams / 2;
                games += roundGames;
                teams -= roundGames; // Remaining teams move forward
            }

            // Final round-robin tournament
            games += teams * (teams - 1) / 2;

            if (games == n) {
                results.add(x);
            }
        }

        return results.isEmpty() ? Collections.singletonList(-1) : results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        List<Long> result = possibleTeams(n);
        for (long x : result) {
            System.out.println(x);
        }

        scanner.close();
    }
}
