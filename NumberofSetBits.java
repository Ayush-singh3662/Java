import java.util.Scanner;

public class NumberofSetBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
