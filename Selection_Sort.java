import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = {12, 6, 74, 1, 0, 67};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = MaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int MaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i=start; i<last; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}