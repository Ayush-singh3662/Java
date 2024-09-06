import java.util.Scanner;

public class PalindromeUsingFunctions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        Palindrome(num);
    }

    static void Palindrome(int num){
        int sum = 0, temp = num;
        while(temp != 0){
            int rem = temp%10;
            temp = temp/10;
            sum = (sum * 10) + rem;
        }
        if(sum == num){
            System.out.print("Given number is Palindrome Number");
        }
        else{
            System.out.print("Given number is not Palindrome Number");
        }
    }
}
