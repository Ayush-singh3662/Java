import java.util.Scanner;

public class PythogoreanTripletUsingFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();
        PythogoreanTriplet(num1, num2, num3);
    }

    static void PythogoreanTriplet(int num1, int num2, int num3){
        num1 = num1 * num1;
        num2 = num2 * num2;
        num3 = num3 * num3;
        if(num1 + num2 == num3 || num2 + num3 == num1 || num3 + num1 == num2){
            System.out.print("Given numbers are Pythogorean Triplet");
        }
        else{
            System.out.print("Given numbers are not Pythogorean Triplet");
        }
    }
}
