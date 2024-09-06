import java.util.Arrays;

public class MergeSort_Recursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[first.length+second.length];
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                ans[k++] = first[i++];
            }
            else {
                ans[k++] = second[j++];
            }
        }
        while(i < first.length) {
            ans[k++] = first[i++];
        }
        while(j < second.length) {
            ans[k++] = second[j++];
        }
        return ans;
    }
}
