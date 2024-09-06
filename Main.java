import java.util.Scanner;
import java.util.Vector;

public class Main {
    static final long mod = 1000000007;
    static final long mod1 = 998244353;

    static Vector<Integer> sieve(int n) {
        int[] arr = new int[n + 1];
        Vector<Integer> vect = new Vector<>();
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                vect.add(i);
                for (int j = 2 * i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return vect;
    }

    static long rec(Vector<Vector<Integer>> v, int s1, int s2, int n, int m, int e1, int e2, Vector<Vector<Integer>> dp) {
        if (s1 > e1 || s2 > e2) {
            return Long.MAX_VALUE;
        }
        if (s1 == e1 && s2 == e2) {
            return v.get(e1).get(e2);
        }
        if (dp.get(s1).get(s2) != -1) {
            return dp.get(s1).get(s2);
        }
        long first = rec(v, s1 + 1, s2, n, m, e1, e2, dp);
        long second = rec(v, s1, s2 + 1, n, m, e1, e2, dp);
        return dp.get(s1).set(s2, (int) (Math.min(first, second) + v.get(s1).get(s2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            v.add(new Vector<>());
            for (int j = 0; j < m; j++) {
                v.get(i).add(sc.nextInt());
            }
        }
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e1 = sc.nextInt();
        int e2 = sc.nextInt();
        s1--;
        s2--;
        e1--;
        e2--;
        if (e1 < s1 || e2 < s2) {
            System.out.println(-1);
            sc.close();
            return;
        }
        Vector<Vector<Integer>> dp = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            dp.add(new Vector<>(m));
            for (int j = 0; j < m; j++) {
                dp.get(i).add(-1);
            }
        }

        long ans = rec(v, s1, s2, n, m, e1, e2, dp);

        System.out.println(ans);
        sc.close();
    }
}