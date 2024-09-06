import java.util.Scanner;

public class ProductOf2NumbersUsingFunction {
    public static void main(String[] args){
        int num1 = 0, num2 = 0;
        System.out.print("Product = "+Product(num1, num2));
    }

    static int Product(int num1, int num2){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        int product = num1 * num2;
        return product;
    }
}
