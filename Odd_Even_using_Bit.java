import java.util.Scanner;

public class Odd_Even_using_Bit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        System.out.println(isOdd(n));
    }
    static String isOdd(int n){
        if((n & 1) == 1){
            return "Odd number";
        }
        else{
            return "Even number";
        }
    }
}