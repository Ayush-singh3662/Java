import java.util.Scanner;

public class Cp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; ++i) {
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; ++i) {
                b[i] = sc.nextInt();
            }
            for(int i=0; i<n-1; ++i) {
                if(a[i] > a[i+1]) {
                    swap(a, i, i+1);
                    swap(b, i, i+1);
                }
            }
            for(int i=0; i<n-1; ++i) {
                if(b[i] > b[i+1]) {
                    swap(a, i, i+1);
                    swap(b, i, i+1);
                }
            }
            for(int i=0; i<n; ++i) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for(int i=0; i<n; ++i) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
