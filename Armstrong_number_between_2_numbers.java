import java.util.Scanner;

public class Armstrong_number_between_2_numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower value: ");
        int lower = input.nextInt();
        System.out.print("Enter upper value: ");
        int upper = input.nextInt();
        System.out.print("Armstrong numbers = ");
        for(int i = lower; i <= upper; i++){
            int number = i;
            int sum = 0;
            while(number != 0){
                int a = number % 10;
                sum = sum + a*a*a;
                number = number/10;
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }
}
