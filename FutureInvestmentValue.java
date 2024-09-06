import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Futurevalue = Presentvalue * (1 + rate)^NumberofCompoundingPeriods
        System.out.print("Enter Present value: ");
        long prevalue = input.nextLong();
        System.out.print("Enter rate of interest: "); //Compound Interest
        double rate = input.nextDouble();
        System.out.print("Enter number of Compounding Periods: ");
        long num = input.nextLong();
        double futvalue = prevalue * (Math.pow((1+rate/100),num));
        System.out.print("Future Investment Value = "+futvalue);
    }
}
