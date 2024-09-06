import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double pri = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double years = input.nextDouble();
        double ci = pri * (Math.pow((1 + rate/100),years));
        System.out.print("Compound Interest = "+ci);
    }
}
