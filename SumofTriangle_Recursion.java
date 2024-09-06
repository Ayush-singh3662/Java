import java.util.*;

public class SumofTriangle_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        answer(arr);
    }
    static void answer(int[] arr) {
        if(arr.length == 0) {     
            return ;
        }
        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++) {
            temp[i] = arr[i] + arr[i+1];
        }
        answer(temp);
        System.out.println(Arrays.toString(arr));
    }    
}
