import java.util.Scanner;

public class PowerOf2_usingBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        if(n == 0){
            System.out.print("Given number is not a Power of 2");
        }
        if((n & (n-1)) == 0){
            System.out.println("Given number is Power of 2");
        }
        else{
            System.out.print("Given number is not a Power of 2");
        }
    }
}
