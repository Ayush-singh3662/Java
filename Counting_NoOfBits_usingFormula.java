import java.util.Scanner;

public class Counting_NoOfBits_usingFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        System.out.print("Enter the base : ");
        int b = input.nextInt();
        int ans = (int) (Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}
