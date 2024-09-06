import java.util.Scanner;

public class Greatest_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = input.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.print("Largest number = "+max);
    }
}