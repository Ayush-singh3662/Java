import java.util.Arrays;

public class MergeSort_Inplace_Recursion {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 84, 7, 24, 3, 54, 334, 24, 12};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[] arr, int start, int end) {
        if(end-start == 1) {
            return ;
        }
        int mid = start + (end - start)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end-start];
        int i = start, j = mid, k = 0;
        while(i < mid && j < end) {
            if(arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            }
            else {
                ans[k++] = arr[j++];
            }
        }
        while(i < mid) {
            ans[k++] = arr[i++];
        }
        while(j < end) {
            ans[k++] = arr[j++];
        }
        for(int l= 0; l<ans.length; l++) {
            arr[start+l] = ans[l];
        }
    }
}