import java.util.Scanner;

public class PalindromeofNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int temp, sum = 0, n = num;
        while(num!=0){
            temp = num % 10;
            num = num / 10;
            sum = (sum * 10) + temp;
        }
        if(sum == n){
            System.out.print("Given number is Palindrome number");
        }
        else{
            System.out.print("Given number is not Palindrome number");
        }
    }
}
