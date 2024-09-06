import java.util.Arrays;
import java.util.Scanner;

// @SuppressWarnings("unused")
class LazyPropogation {
    static int[] a, seg, lazy;
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        seg = new int[4*n];
        lazy = new int[4*n];
        for(int i=0; i<n; ++i) {
            a[i] = in.nextInt();
        }
        int val = in.nextInt();
        int q = in.nextInt();
        while(q-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            queryUpdate(0, 0, n-1, l, r, val);
            System.out.println(Arrays.toString(seg));
            System.out.println(sumLazy(0, 0, n-1, l, r, val));
        }
        in.close();
    }

    // @SuppressWarnings("unused")
    private static void queryUpdate(int ind, int low, int high, int l, int r, int val) {
        if(lazy[ind] != 0) {
            seg[ind] += (high-low+1) * lazy[ind];
            if(high != low) {
                lazy[2*ind+1] += lazy[ind];
                lazy[2*ind+2] += lazy[ind];
            }
            lazy[ind] = 0;
        }
        if(high < l || low > r || low > high) {
            return ;
        }
        if(low >= l && high <= r) {
            seg[ind] += (high-low+1) * val;
            if(high != low) {
                lazy[2*ind+1] += val;
                lazy[2*ind+2] += val;
            }
            return ;
        }
        int mid = low + (high-low)/2;
        queryUpdate(2*ind+1, low, mid, l, r, val);
        queryUpdate(2*ind+2, mid+1, high, l, r, val);
        seg[ind] = seg[2*ind+1] + seg[2*ind+2];
    }

    // @SuppressWarnings("unused")
    private static int sumLazy(int ind, int low, int high, int l, int r, int val) {
        if(lazy[ind] != 0) {
            seg[ind] += (high-low+1) * lazy[ind];
            if(high != low) {
                lazy[2*ind+1] += lazy[ind];
                lazy[2*ind+2] += lazy[ind];
            }
            lazy[ind] = 0;
        }
        if(high < l || low > r || low > high) return 0;
        if(low >= l && high <= r) {
            return seg[ind];
        }
        int mid = low + (high-low)/2;
        return sumLazy(2*ind+1, low, mid, l, r, val) + sumLazy(2*ind+2, mid+1, high, l, r, val);
    }
}