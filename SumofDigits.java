import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int temp, sum = 0;
        while(num != 0){
            temp = num%10;
            num = num/10;
            sum = sum + temp;
        }
        System.out.print("Sum of digits = "+sum);
    }
}
