import java.util.Scanner;

public class Maxprofit {

    public static long maxProfit(int n, int k, int[] profit) {
        int[] doubledProfit = new int[2 * n];
        System.arraycopy(profit, 0, doubledProfit, 0, n);
        System.arraycopy(profit, 0, doubledProfit, n, n);
        long[] prefixSum = new long[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            prefixSum[i] = prefixSum[i - 1] + doubledProfit[i - 1];
        }
        long maxProfit = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long sumK = prefixSum[i + k] - prefixSum[i];
            int oppositeStart = (i + n - k) % n;
            long sumOppositeK = prefixSum[oppositeStart + k] - prefixSum[oppositeStart];
            long totalProfit = sumK + sumOppositeK;
            maxProfit = Math.max(maxProfit, totalProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
            a[i] = in.nextInt();
        }
        System.out.println(maxProfit(n, k, a));
        in.close();
    }
}
