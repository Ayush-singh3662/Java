import java.util.Arrays;

public class QuickSort_Recursion {
    public static void main(String[] args) {
       int[] arr = {2, 5, 6, 56, 2, 5, 3, 2, 5, 8};
       quick(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr, int low, int high) {
        if(low >= high) {
            return ;
        }
        int start = low, end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start <= end) {
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr, low, end);
        quick(arr, start, high);
    }
}