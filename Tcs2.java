import java.util.Arrays;
import java.util.Scanner;

public class Tcs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] temp = Arrays.copyOfRange(arr, 0, n);
        int asc = bubbleSort(arr, true);
        arr = temp;
        int desc = bubbleSort(arr, false);
        System.out.print(Math.min(asc, desc));
    }

    public static int bubbleSort(int[] arr, boolean asc) {
        int n = arr.length;
        int temp = 0;
        int swap = 0;
        if (asc) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                        ++swap;
                    }
                }
            }
            return swap;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] < arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                        ++swap;
                    }
                }
            }
            return swap;
        }
    }
}