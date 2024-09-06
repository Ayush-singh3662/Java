import java.util.Scanner;

class LIS {
    static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = in.nextInt();
        }
        System.out.println(rec(0, -1));
        in.close();
    }

    private static int rec(int i, int last) {
        if(i == arr.length) {
            return 0;
        }
        int notTake = rec(i+1, i);
        int take = 0;
        if(last != -1 && arr[i] > arr[last]) {
            take = 1 + rec(i+1, i);
        }
        return Math.max(take, notTake);
    }
}