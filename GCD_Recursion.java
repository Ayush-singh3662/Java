import java.util.Scanner;

public class GCD_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a,b));
    }
    static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
}
