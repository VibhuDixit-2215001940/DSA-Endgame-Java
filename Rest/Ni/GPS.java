import java.util.*;

public class GPS {
    static int[] dx = { 0, 0, -1, 1 }; // Left, Right, Up, Down
    static int[] dy = { -1, 1, 0, 0 };
    static final int NO_DIRECTION = -1;

    public static String canDrive(char[][] grid, int b, int p) {
        int startX = -1, startY = -1, endX = -1, endY = -1;

        // Locate 'Q' and 'W'
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < p; j++) {
                if (grid[i][j] == 'Q') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'W') {
                    endX = i;
                    endY = j;
                }
            }
        }

        // BFS queue
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[b][p][4]; // (x, y) visited in a specific direction

        // Start BFS in all possible directions
        for (int d = 0; d < 4; d++) {
            int nx = startX + dx[d];
            int ny = startY + dy[d];

            if (isValid(nx, ny, grid, b, p)) {
                queue.add(new int[] { nx, ny, d, 0 }); // x, y, direction, turns
                visited[nx][ny][d] = true;
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], direction = curr[2], turns = curr[3];

            // If reached 'W' with at most 2 turns, return "DRIVE!"
            if (x == endX && y == endY && turns <= 2) {
                return "DRIVE!";
            }

            // Explore all four possible moves
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (!isValid(nx, ny, grid, b, p))
                    continue;

                int newTurns = (direction == d) ? turns : turns + 1;

                if (newTurns > 2 || visited[nx][ny][d])
                    continue;

                queue.add(new int[] { nx, ny, d, newTurns });
                visited[nx][ny][d] = true;
            }
        }

        return "DON'T DRIVE!";
    }

    static boolean isValid(int x, int y, char[][] grid, int b, int p) {
        return x >= 0 && y >= 0 && x < b && y < p && grid[x][y] != 'X';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[b][p];
        for (int i = 0; i < b; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < p; j++) {
                grid[i][j] = row[j].charAt(0);
            }
        }

        System.out.println(canDrive(grid, b, p));
        scanner.close();
    }
}
// 5
// 5
// O O O Q O
// X X X X O
// W O O O O
// X X X X O
// O O O O O
// DRIVE!

// 5
// 5
// Q O O O O
// X X X X O
// O O O O O
// O X X X X
// O O O O W
// DON'T DRIVE!

// Approach without State Class
// We will:

// Find Q (start) and W (end).
// Use BFS (or DFS) with arrays to keep track of:
// The current position (x, y).
// The previous direction.
// The turn count.
// A visited array that ensures each cell is explored in different directions
// separately.
// Limit the number of turns to at most two.
// Return "DRIVE!" if a path is found, otherwise "DON'T DRIVE!".
