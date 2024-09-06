import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for(int x : hm.keySet()) {
            if(hm.get(x)>arr.length/3) {
                list.add(x);
            }
        }
        System.out.println(list);
    }
}
