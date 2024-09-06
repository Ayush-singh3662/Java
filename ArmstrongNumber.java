import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long num = input.nextLong();
        long temp = num, a, sum = 0;
        while(temp!=0){
            a = temp%10;
            temp = temp/10;
            sum = sum + a*a*a;
        }
        if(sum == num){
            System.out.print("Given number is Armstrong number");
        }
        else{
            System.out.print("Given number is not Armstrong number");
        }
    }
}