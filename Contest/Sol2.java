import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            boolean flag = false;
            int n = sc.nextInt();
            String[] a = new String[n];
            for(int i=0; i<n; ++i) {
                // for(int j=0; j<n; ++j) {
                    a[i] = sc.next();
                // }
            }
            int prev = 0;
            for(int i=0; i<n; ++i) {
                int cnt = 0;
                for(int j=0; j<n; ++j) {
                    if(a[i].charAt(j) == '1') {
                        cnt++;
                    }
                }
                if(prev > 0) { 
                    print(cnt, prev);
                    flag = true;
                    break;
                }
                prev = cnt;
                if(flag) {
                    break;
                }
            }
        }
    }

    private static void print(int cnt, int prev) {
        if(cnt == prev) {
            System.out.println("SQUARE");
            return ;
        }
        if(Math.abs(cnt-prev) == 2) {
            System.out.println("TRIANGLE");
            return ;
        }
    }
}