import java.util.Arrays;

public class Maze5_Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        path("", maze, 0, 0, path, 1);
    }
	static void path(String str, boolean[][] maze, int row, int col, int[][] path, int step) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            System.out.println();
            return ;
        }
        if(!(maze[row][col])) {
            return ;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if(row < maze.length-1) {
            path(str+'D', maze, row+1, col, path, step+1);
        }
        if(col < maze[0].length-1) {
            path(str+'R', maze, row, col+1, path, step+1);
        }
        if(col > 0) {
            path(str+'L', maze, row, col-1, path, step+1);
        }
        if(row > 0) {
            path(str+'U', maze, row-1, col, path, step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
