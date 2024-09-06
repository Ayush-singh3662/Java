import java.util.ArrayList;

public class ArrayList_targetarray{
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }

    public static ArrayList<Integer> createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            list.add(index[i],nums[i]);
        }
        return list;
    }
}
