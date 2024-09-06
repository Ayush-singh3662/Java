public class Maze4_Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        path("", maze, 0, 0);
    }
	static void path(String str, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.print(str + " ");
            return ;
        }
        if(!(maze[row][col])) {
            return ;
        }
        maze[row][col] = false;
        if(row < maze.length-1) {
            path(str+'D', maze, row+1, col);
        }
        if(col < maze[0].length-1) {
            path(str+'R', maze, row, col+1);
        }
        if(col > 0) {
            path(str+'L', maze, row, col-1);
        }
        if(row > 0) {
            path(str+'U', maze, row-1, col);
        }
        maze[row][col] = true;
    }
}
