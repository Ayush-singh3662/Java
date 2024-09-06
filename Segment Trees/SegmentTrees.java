import java.util.Scanner;

class SegmentTrees {

    static int[] a, seg;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        seg = new int[4*n];
        for(int i=0; i<n; ++i) {
            a[i] = in.nextInt();
        }
        build(0, 0, n-1);
        int q = in.nextInt();
        while(q-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(query(0, 0, n-1, l, r));
        }
        in.close();
    }

    private static void build(int ind, int low, int high) {
        if(low == high) {
            seg[ind] = a[low];
            return ;
        }
        int mid = low + ((high-low)/2);
        build(2*ind+1, low, mid);
        build(2*ind+2, mid+1, high);
        seg[ind] = Math.max(seg[2*ind+1], seg[2*ind+2]);
    }

    private static int query(int ind, int low, int high, int l, int r) {
        if(low >= l && high <= r) {
            return seg[ind];
        }
        if(high < l || low > r) {
            return Integer.MIN_VALUE;
        }
        int mid = low + ((high-low)/2);
        int left = query(2*ind+1, low, mid, l, r);
        int right = query(2*ind+2, mid+1, high, l, r);
        return Math.max(left, right);
    }
}