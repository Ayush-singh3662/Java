import java.util.Scanner;

public class DiscountofProduct {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float amount = input.nextFloat();
        System.out.print("Enter the Rate of Discount: ");
        float rate = input.nextFloat();
        float disrate = (rate * amount)/100;
        float disamount = amount - disrate;
        System.out.print("Discount Amount = "+disamount);
    }
}
