import java.util.Scanner;

public class XorOfa_to_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);
    }
    static int xor(int n){
        if(n==0){
            return 0;
        }
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        return 0;
    }
}
