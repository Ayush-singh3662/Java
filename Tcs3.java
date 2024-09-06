import java.util.Scanner;

public class Tcs3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        // Input maze
        int[][] maze = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        // Input starting block coordinates
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();

        // Input target block coordinates
        int targetRow = scanner.nextInt();
        int targetCol = scanner.nextInt();

        // Solve the maze using DFS
        int result = findShortestPath(maze, startRow, startCol, targetRow, targetCol, R, C);
        System.out.println(result != Integer.MAX_VALUE ? result : "STUCK");

        scanner.close();
    }

    private static int findShortestPath(int[][] maze, int startRow, int startCol, int targetRow, int targetCol, int R, int C) {
        boolean[][] visited = new boolean[R][C];
        return dfs(maze, startRow, startCol, targetRow, targetCol, visited, R, C);
    }

    private static int dfs(int[][] maze, int row, int col, int targetRow, int targetCol, boolean[][] visited, int R, int C) {
        if (row < 0 || row >= R || col < 0 || col >= C || maze[row][col] == 1 || visited[row][col]) {
            return Integer.MAX_VALUE; // Invalid path or already visited
        }

        if (row == targetRow && col == targetCol) {
            return 0; // Reached the target
        }

        visited[row][col] = true;

        int[] dr = {-1, 0, 1, 0}; // Possible moves: Up, Right, Down, Left
        int[] dc = {0, 1, 0, -1};

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            int distance = dfs(maze, newRow, newCol, targetRow, targetCol, visited, R, C);

            if (distance != Integer.MAX_VALUE) {
                // Check for dangerous block 3
                if (maze[row][col] == 3 && distance >= 1) {
                    distance--; // Cross dangerous block only if it's the only way
                }

                minDistance = Math.min(minDistance, distance + 1);
            }
        }

        visited[row][col] = false;

        return minDistance;
    }
}
