import java.util.Scanner;

public class EvenOddusingFunction {
    public static void main(String[] args){
        int num = 0;
        EvenorOdd(num);
    }

    static void EvenorOdd(int num){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = input.nextInt();
        if(num%2 == 0){
            System.out.print("Given number is Even number");
        }
        else{
            System.out.print("Given number is Odd number");
        }
    }
}
