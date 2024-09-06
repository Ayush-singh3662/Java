import java.util.ArrayList;

public class ArrayList_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        int target = 4;
        System.out.println(find(arr, target, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index+1, list);
    }
}
