import java.util.Arrays;

public class ConcetenationOfArray{
    public static void main(String[] args){
        int[] nums = {1, 3, 2, 1};
        int n = nums.length;
        int[] ans = new int[2*n];;
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}