import java.util.HashMap;
import java.util.Scanner;

public class Div31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; ++i) {
                a[i] = sc.nextInt();
            }
            HashMap<String, Integer> map = new HashMap<>();
            long res = 0;
            for(int i : a) {
                int[] arr = new int[] {(i%x), (i%y)};
                res += map.getOrDefault((x-arr[0])%x+" "+arr[1], 0);
                map.put(arr[0]+" "+arr[1], map.getOrDefault(arr[0]+" "+arr[1], 0)+1);
            }
            System.out.println(res);
        }
    }
}