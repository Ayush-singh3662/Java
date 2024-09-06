import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of electricity: Rs");
        int cost = input.nextInt();
        System.out.print("Enter the electricity used in units: ");
        float units = input.nextFloat();
        System.out.print("Enter the number of days electricity used: ");
        int days = input.nextInt();
        float bill = cost * units * days;
        System.out.print("Electricity bill = Rs"+bill);
    }
}
