import java.util.Scanner;

public class Rupees_into_USD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        float rupees = input.nextFloat();
        float usd = (float) 0.0120951 * rupees;
        System.out.println("Amount in USD = "+usd);
    }
}
