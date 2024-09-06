import java.util.Scanner;

public class Fibonacci_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n = input.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        for(int i = 3; i<=n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.print("Fibonacci number = "+n3);
    }
}