public class Order_Agnostics_Binary_Search {
    public static void main(String[] args){
        int[] arr = {90, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticsBs(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticsBs(int[] arr, int target){
        int start = 0; 
        int end = arr.length-1;
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
}
