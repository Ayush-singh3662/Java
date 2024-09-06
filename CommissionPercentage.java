import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        float amount = input.nextFloat();
        System.out.print("Enter the Rate of Commission: ");
        float rate = input.nextFloat();
        float com = (rate * amount)/100;
        System.out.print("Commission Payment = "+com);
    }
}
