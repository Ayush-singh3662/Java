import java.util.Scanner;

public class SumofDifferentNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum1 = 0, sum2 = 0, sum3 = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            if(num<0){
                sum1 = sum1 + num;
            }
            if(num>0 && num%2 == 0){
                sum2 = sum2 + num;
            }
            if(num>0 && num%2 != 0){
                sum3 = sum3 + num;
            }
        }
        System.out.println("Sum of negative numbers = "+sum1);
        System.out.println("Sum of positive even number = "+sum2);
        System.out.println("Sumof positive odd number = "+sum3);
    }
}
