import java.util.ArrayList;

public class Pair_Sum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 166;
        System.out.println(pairSum2(list, target));
    }
    //brute force approach
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

    //optimised approach
    private static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lp = 0, rp = 0;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                lp = i+1;
                rp = i;
                break;
            }
        }
        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp++;
                lp %= list.size();
            }
            else {
                rp--;
                if(rp<0) {
                    rp += list.size();
                }
            }
        }
        return false;
    }
}
