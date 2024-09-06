import java.util.Scanner;

public class Reversed_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any nummber: ");
        int n = input.nextInt();
        System.out.print("Reversed number = ");
        while(n != 0){
            int a = n%10;
            n = n/10;
            System.out.print(a);
        }
    }
}