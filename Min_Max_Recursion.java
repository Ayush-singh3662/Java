public class Min_Max_Recursion {
    public static void main(String[] args) {
        int[] arr = {2, -1, 6, 36, 9, 76, -27};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        answer(arr, min, max, 0);
    }
    static void answer(int[] arr, int min , int max, int index) {
        if(index == arr.length) {
            System.out.print(min + " ");
            System.out.print(max + " ");
            return ;
        }
        if(arr[index] < min) {
            min = arr[index];
        }
        if(arr[index] > max) {
            max = arr[index];
        }
        answer(arr, min, max, index+1);
    }
}
