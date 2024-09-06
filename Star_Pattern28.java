import java.util.Scanner;

public class Star_Pattern28{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n =  input.nextInt();
      for(int row=1; row<2*n; row++){
         int totalcol = row>n ? 2*n-row : row;
         int spaces = Math.abs(row-n);
         for(int space = 0; space<spaces; space++){
            System.out.print(" ");
         }
         for(int col = 1; col<=totalcol; col++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}