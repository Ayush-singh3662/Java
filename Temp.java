import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i=0; i<a; ++i) {
            for(int j=0; j<b; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        p -= 1;
        q -= 1;
        r -= 1;
        s -= 1;
        if(r < p || s < q) {
            System.out.print(-1);
            sc.close();
            return ;
        }
        int[][] res = new int[a][b];
        for(int i=0; i<a; ++i) {
            for(int j=0; j<b; ++j) {
                res[i][j] = -1;
            }
        }
        int ans = rec(arr, p, q, r, s, res);
        System.out.print(ans);
        sc.close();
    }

    private static int rec(int[][]arr, int p, int q, int r, int s, int[][] res) {
        if(p > r || q > s) {
            return Integer.MAX_VALUE;
        }
        if(p == r && q == s) {
            return arr[r][s];
        }
        if(res[p][q] != -1) {
            return res[p][q];
        }
        int first = rec(arr, p+1, q, r, s, res);
        int second = rec(arr, p, q+1, r, s, res);
        return res[p][q] = Math.min(first, second) + arr[p][q];
    }
}
