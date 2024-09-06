import java.util.Scanner;

public class Temp {
    public static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int[][] dp = new int[n + 1][x + 1];
        for (int i = 0; i <= n; ++i) {
            dp[i][0] = 1;
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = 1; j <= x; ++j) {
                int notTake = (dp[i + 1][j]) % mod;
                int take = 0;
                if (a[i] <= j)
                    take = (dp[i][j - a[i]]) % mod;
                dp[i][j] = (take + notTake) % mod;
            }
        }
        System.out.println(dp[0][x]);
        in.close();
    }
}
