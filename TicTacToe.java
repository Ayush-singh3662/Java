import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        while(!gameOver) {
            display(board);
            if(isFull(board)) {
                System.out.println("Game Draw!!");
                return ;
            }
            System.out.print("Player "+player+" enter your move: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = isWon(board, player);
                if(gameOver) {
                System.out.println("Player "+player+" has won.");
                }
                else {
                    player = player == 'X' ? 'O' : 'X';
                }
            }
            else {
                System.out.println("Invalid Move. Try Again.");
            }
        }
        display(board);
    }

    public static void display(char[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
    
    public static boolean isWon(char[][] board, char player) {
        for(int row=0; row<board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for(int col=0; col<board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static boolean isFull(char[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
