import java.util.Scanner;

public class FindPowerofaNumber_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        System.out.print("Enter the value of base: ");
        int a = input.nextInt();
        System.out.print("Value of power = ");
        System.out.println(power(n, a, 0));
    }
    static int power(int n, int a, int count) {
        if(n==1) {
            return count;
        }
        return power(n/a, a, count = count+1);
    }
}
