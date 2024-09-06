import java.util.Scanner;

public class Even_Odd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.println("Given number is even number");
        }
        else{
            System.out.println("Given number is odd number");
        }
    }
}