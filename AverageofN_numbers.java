import java.util.Scanner;

public class AverageofN_numbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of numbers: ");
        int n = input.nextInt();
        float sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Enter the "+i+" number: ");
            Float a = input.nextFloat();
            sum = sum + a;
        }
        float avg = sum / n;
        System.out.print("Average of numbers = "+avg);

    }
}