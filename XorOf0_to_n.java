import java.util.Scanner;

public class XorOf0_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(xor(n));
    }
    static int xor(int n){
        if(n==0){
            return 0;
        }
        if(n%4 == 0){
            return n;   
        }
        else if(n%4 == 1){
            return 1;
        }
        else if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
