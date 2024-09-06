import java.util.Scanner;

public class Counting_noOfBits {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int count = 0;
        while(n>0){
            n = n>>1;
            count++;
        }
        System.out.println(count);
    }
}