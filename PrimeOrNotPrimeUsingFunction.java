import java.util.Scanner;

public class PrimeOrNotPrimeUsingFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        PrimeOrNot(num);
    }

    static void PrimeOrNot(int num){
        int count = 0;
        for(int i = 2; i<=num-1; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }
    }
}
