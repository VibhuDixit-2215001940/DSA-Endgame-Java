import java.util.*;

class MinimumKTurnsPath {
    static class State {
        int x, y, dir, turns;

        State(int x, int y, int dir, int turns) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.turns = turns;
        }
    }

    public static boolean minKTurns(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int[][][] visited = new int[n][m][4];

        for (int[][] v : visited)
            for (int[] row : v)
                Arrays.fill(row, Integer.MAX_VALUE);

        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, -1, 0));

        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // Right, Down, Left, Up

        while (!queue.isEmpty()) {
            State cur = queue.poll();

            if (cur.x == n - 1 && cur.y == m - 1 && cur.turns <= k)
                return true;

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + directions[d][0];
                int ny = cur.y + directions[d][1];
                int newTurns = (cur.dir == -1 || cur.dir == d) ? cur.turns : cur.turns + 1;

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == 0 && newTurns <= k
                        && newTurns < visited[nx][ny][d]) {
                    visited[nx][ny][d] = newTurns;
                    queue.add(new State(nx, ny, d, newTurns));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 1, 1 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        int k = 1;
        System.out.println(minKTurns(grid, k));
    }
}