import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            helper(a, b);
        }
        sc.close();
    }

    private static void helper(int a, int b) {
        int min = Math.min(a, b);
        if(min % 2 == 0) {
            System.out.println("Yes");
            return ;
        }
        int max = Math.max(a, b);
        if(max / 2 == min) {
            System.out.println("No");
            return ;
        }
        if(a % 2 != 0 && b % 2 != 0) {
            System.out.println("No");
            return ;
        }
        System.out.println("Yes");
    }
}
