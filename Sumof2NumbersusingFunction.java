import java.util.Scanner;

public class Sumof2NumbersusingFunction {
    public static void main(String[] args){
        int num1 = 0,num2 = 0;
        System.out.print("Sum = "+Sum(num1,num2));
    }

    static int Sum(int num1, int num2){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
