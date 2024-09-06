public class SmallerThanCurrentNumber{
    public static void main(String[] args){
        int[] nums = {8, 1, 2, 2, 3};
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}