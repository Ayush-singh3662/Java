import java.util.Scanner;

public class DepricationofValues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        long amount = input.nextLong();
        System.out.print("Enter percentage of Depriciation: ");
        long per = input.nextLong();
        System.out.print("Enter no. of Years: ");
        long years = input.nextLong();
        for(int i = 0; i<years; i++){
            amount = ((100-per)*amount)/100;
        }
        System.out.print("Depriciable amount = "+amount);
    }
}