import java.util.Scanner;

public class SumofDigits_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if(n==0){
            return 0;
        }
        return sum(n/10)+(n%10);
    }
}
