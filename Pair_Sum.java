import java.util.ArrayList;

public class Pair_Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 9;
        System.out.println(pairSum2(list, target));
    }
 //brute force approach.
    private static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    //optimised approach.
    private static boolean pairSum2(ArrayList<Integer> list, int target) {
        int i=0, j = list.size()-1;
        while(i<j) {
            if(list.get(i) + list.get(j) == target) {
                return true;
            }
            else if(list.get(i) + list.get(j) < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}
