import java.util.ArrayList;

public class ArrayList_withoutArguments_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 1, 1, 3};
        int target = 1;
        System.out.println(findall(arr, target, 0));
    }
    //this method is not so good because it is creating new ArryList for every recursive calls.
    static ArrayList<Integer> findall(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> list2 = findall(arr, target, index+1);
        list.addAll(list2);
        return list;
    }
}
