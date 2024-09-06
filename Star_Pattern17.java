import java.util.Scanner;

public class Star_Pattern17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row=1; row<2*n; row++){
            for(int space=1; space<=Math.abs(n-row); space++){
                System.out.print(" ");
            }
            int totalcol = row>n ? (2*n)-row : row;
            for(int col=totalcol; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=totalcol; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
