public class Linear_Search{
    public static void main(String[] args){
        int[] arr = {12, 13, 14, 156, 78, 4, 3, 2};
        System.out.println(LinearSearch(arr, 457));
    }
//search in the array: return the index if the element found
//otherwuse it will return -1
    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}