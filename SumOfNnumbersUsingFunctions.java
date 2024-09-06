import java.util.Scanner;

public class SumOfNnumbersUsingFunctions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        System.out.print("Sum of "+n+" numbers =  "+Sum(n));
    }

    static int Sum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
