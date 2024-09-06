import java.util.Scanner;

public class Star_Pattern5{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      for(int i=1; i<2*n; i++){
         int cols = i>n ? 2*n-i : i;
         for(int col=0; col<cols; col++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}