import java.util.Scanner;

public class Sumof_nNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total no. of numbers: ");
        int n = input.nextInt();
        int num, sum = 0;
        for(int i = 1; i<=n; i++){
            System.out.print("Enter number "+i+": ");
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.print("Sum of "+n+" numbers: "+sum);
    }
}
