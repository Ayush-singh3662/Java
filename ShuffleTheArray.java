import java.util.Arrays;

public class ShuffleTheArray{
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2};
        int n = nums.length/2;
        int[] ans = new int[2*n];
        for(int i=0, j=0; i<n && j<nums.length; i++, j=j+2){
            ans[j] = nums[i];
        }
        for(int i=n, j=1; i<nums.length && j<nums.length; i++, j=j+2){
            ans[j] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}