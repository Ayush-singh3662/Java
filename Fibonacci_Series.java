import java.util.Scanner;

public class Fibonacci_Series{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i = 3; i<=n; i++){
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        input.close();
    }
}