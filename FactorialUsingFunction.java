import java.util.Scanner;

public class FactorialUsingFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.println("Factorial = "+Factorial(num));
    }

    static int Factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
