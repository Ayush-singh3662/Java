import java.util.Scanner;

public class PowerofaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = input.nextInt();
        System.out.print("Enter the power : ");
        int power = input.nextInt();
        int ans = 1;
        while(power>0){
            if((power & 1) == 1){
                ans *= base;
            }
            power = power>>1;
            base *= base;
        }
        System.out.println(ans);
    }
}