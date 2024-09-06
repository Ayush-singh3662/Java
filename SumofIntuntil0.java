import java.util.Scanner;

public class SumofIntuntil0 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum = 0;
        while(true){
           int num = input.nextInt();
           if(num == 0){
              break;
           }
           sum = sum + num;
        }
        System.out.print("Result = "+sum);
     }
}
