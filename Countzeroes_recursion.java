import java.util.Scanner;

public class Countzeroes_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // count(n);
        // System.out.println(count);
        System.out.println(count2(n));
    }
    //way 1 method
    static int count = 0;
    static void count(int n) {
        if(n==0) {
            return ;
        }
        if(n%10==0) {
            count++;
        }
        count(n/10);
    }
    //way 2 method
    static int count2(int n) {
        return helper(n,0);
    }
    private static int helper(int n, int c) {
        if(n==0) {
            return c;
        }
        if(n%10==0) {
            return helper(n/10,c+1);
        }
        return helper(n/10, c);
    }
}
