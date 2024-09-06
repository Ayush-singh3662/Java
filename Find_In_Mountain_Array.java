public class Find_In_Mountain_Array{

    //https://leetcode.com/problems/find-in-mountain-array/description/

    public static void main(String[] args){
        int[] arr = {2,3,4,5,3,1};
        // int[] arr = {0,1,2,4,2,1};
        int target = 1;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int peak = peak(arr);
        int firsttry = search(arr, target, 0, peak);
        if(firsttry != -1){
            return firsttry;
        }
        return search(arr, target, peak+1, arr.length-1);
    }

    static int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean isAsc;
            if(arr[start]<arr[end]){
                isAsc = true;
            }
            else{
                isAsc = false;
            }
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end = mid;
            }
        }
        return start;
    }

}