import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] pos = new int[n];
            HashMap<Integer, Integer> positive = new HashMap<>();
            HashMap<Integer, Integer> negative = new HashMap<>();
            for(int i=0; i<n; ++i) {
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; ++i) {
                pos[i] = sc.nextInt();
            }
            for(int i=0; i<n; ++i) {
                if(pos[i] > 0) {
                    positive.put(pos[i], a[i]);
                } else {
                    negative.put(-1*pos[i], a[i]);
                }
            }
            // long result = 0L;
            long prev = 0L;
            boolean p = false;
            for(int i=1; i<=n; ++i) {
                long net = 0L;
                if(positive.containsKey(i)) {
                    net += positive.get(i);
                }
                if(negative.containsKey(i)) {
                    net += negative.get(i);
                }
                long have = k + prev;
                if(net > have) {
                    System.out.println("No");
                    p = true;
                    break;
                }
                else {
                    long remain = have-net;
                    prev = remain;
                }
            }
            if(!p) {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}