package Heaps;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        heapSort(arr);
        for(int i=0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for(int i=n/2; i>=0; --i) {
            heapify(arr, i, n);
        }
        for(int i=n-1; i>0; --i) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int size) {
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < size && arr[left] > arr[max]) {
            max = left;
        }
        if(right < size && arr[right] > arr[max]) {
            max = right;
        }
        if(max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, max, size);
        }
    }
}
