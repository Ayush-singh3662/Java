import java.util.Scanner;

public class FactorsofNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Factors = ");
        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
