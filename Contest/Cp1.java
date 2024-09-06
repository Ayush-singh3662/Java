import java.util.*;
public class Cp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((m/2) * n);
            
        }
        sc.close();
    }
}