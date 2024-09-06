import java.util.Scanner;

public class ReverseaNumber_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        reverse(n);
        System.out.println(sum);
        System.out.println(reverse2(n));
    }
    static int sum = 0;
    static void reverse(int n) {
        if(n==0) {
            return ;
        }
        sum = sum*10+(n%10);
        reverse(n/10);
    }
    static int reverse2(int n) {
        if(n==0) {
            return 0;
        }
        int digits = (int) (Math.log10(n)); //Here, digits will be equal to one number less than total number of digits i.e. Math.log10(1234) = 3.
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if(n==0) {
            return 0;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits))+helper(n/10, digits-1);
    }
}