public class BinarySearch_Using_Recursion{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 9, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}