import java.util.Scanner;

public class MagicNumber_Bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int ans = 0, base = 5, temp = n;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            ans += base*last;
            base *= 5;
        }
        System.out.println(temp+"th magic number = "+ans);
    }
}
