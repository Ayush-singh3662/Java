import java.util.Arrays;
import java.util.Scanner;

public class T {
    static int t;
    static int[][] dp = new int[10001][10001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
            a[i] = in.nextInt();
        }
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int q = in.nextInt();
        while(q-- > 0) {
            t = in.nextInt();
            System.out.println(rec(0, t, a) == 1 ? true : false);
        }
        in.close();
    }

    private static int rec(int i, int sum, int[] a) {
        if(sum < 0) {
            return 0;
        }
        if(i == a.length) {
            if(sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if(dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int ans = 0;
        if(rec(i+1, sum, a) == 1) { //not take
            ans = 1;
        } else if(rec(i+1, sum-a[i], a) == 1) { //take
            ans = 1;
        }
        return dp[i][sum] = ans;
    }
}
