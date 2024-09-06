public class Linear_Search_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 1, 1, 2, 3, 4, 1};
        int target = 1;
        System.out.println(search(arr, target, 0));
        System.out.println(findindex(arr, target, 0));
        findall(arr, target, 0);
    }

    static boolean search(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    static int findindex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else{
            return findindex(arr, target, index+1);
        }
    }

    static void findall(int[] arr, int target, int index) {
        if(index == arr.length) {
            return ;
        }
        if(arr[index] == target) {
            System.out.print(index + " ");
        }
        findall(arr, target, index+1);
    }
}
