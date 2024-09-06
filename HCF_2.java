import java.util.Scanner;

public class HCF_2{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 1st number: ");
      int num1 = input.nextInt();
      System.out.print("Enter 2nd number: ");
      int num2 = input.nextInt();
      int gcd = 1;
      for(int i=1; i<=num1 && i<=num2; i++){
         if(num1%i==0 && num2%i==0){
            gcd = i;
         }
      }
      System.out.print("HCF = "+gcd);
   }
}