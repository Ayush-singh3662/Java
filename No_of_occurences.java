import java.util.Scanner;

public class No_of_occurences{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        System.out.print("Enter the digit: ");
        int x = input.nextInt();
        int count = 0;
        while(n != 0){
            int a = n%10;
            n = n/10;
            if(a == x){
                count++;
            }
        }
        System.out.print("Number of occurences = "+count);
    }
}