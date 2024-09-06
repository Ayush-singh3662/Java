import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int a, prod = 1, add = 0;
        while(num != 0){
            a = num % 10;
            num = num / 10;
            prod = prod * a;
            add = add + a;
        }
        int result = prod - add;
        System.out.print("Result = "+result);
    }
}
