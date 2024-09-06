import java.util.Scanner;

public class Cp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=0; i<=r; ++i) {
                int res = Math.abs((a^i) - (b^i));
                min = Math.min(min, res);
            }
            System.out.println(min);
        }
        sc.close();
    }
}
