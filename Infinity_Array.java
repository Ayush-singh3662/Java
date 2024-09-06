public class Infinity_Array {
    
    //Searching for a target element in an infinite length of array i.e. we don't know the length of array. 

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target = 29;
        System.out.println(ans(nums, target));
    }

    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int temp = end +1;
            end = end +(end -start + 1)*2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
