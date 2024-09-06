public class Minimum_Number {
    public static void main(String[] args){
        int[] arr = {12, 4, 56, 7, -9, 6, 4};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
