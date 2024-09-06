import java.util.Scanner;

public class Palindrome_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int num = rev(n);
        // if(n==num){
        //     System.out.println("Palindrome number");
        // }
        // else {
        //     System.out.println("Not a Palindrome number");
        // }
        System.out.println(palindrome(n));
    }
    //way 1 method
    static int sum = 0;
    static void reverse(int n) {
        if(n==0) {
            return ;
        }
        sum = sum*10+(n%10);
        reverse(n/10);
    }
    //way 2 method
    static int rev(int n) {
        if(n==0) {
            return 0;
        }
        int digits = (int) Math.log10(n);
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if(n==0) {
            return 0;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits)+helper(n/10, digits-1);
    }
    static boolean palindrome(int n){
        return n == rev(n);
    }
}