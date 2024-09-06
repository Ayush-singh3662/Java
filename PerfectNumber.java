import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.print("Given number is perfect number");
        }
        else{
            System.out.print("Given number is not perfect number");
        }
    }
}
