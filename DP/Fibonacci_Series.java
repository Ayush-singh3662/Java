// package DP;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Memoization Method -> T.C = O(N), S.C = O(N)[Recursion Stack Space] + O(N)[Dp Array]
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));

        //Tabulation Mathod -> T.C = O(N), S.C = O(N)[Dp Array]
        int[] dp2 = new int[n+1];
        Arrays.fill(dp2, -1);
        dp2[0] = 0;
        dp2[1] = 1;
        for(int i=2; i<=n; ++i) {
            dp2[i] = dp2[i-1] + dp2[i-2];
        }
        System.out.println(dp2[n]);

        //Optimised Space Complexity
        int prev2 = 0;
        int prev = 1;
        for(int i=2; i<=n; ++i) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
        sc.close();
    }

    private static int fib(int n, int[] dp) {
        if(n < 2) {
            return n;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fib(n-1 , dp) + fib(n-2, dp);
    }
}
