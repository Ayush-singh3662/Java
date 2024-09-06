import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[200001];
        for(int i=1; i<dp.length; ++i) {
            long sum = 0;
            int k = i;
            while(k > 0) {
                sum += k%10;
                k /= 10;
            }
            dp[i] = sum + dp[i-1];
        }
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}