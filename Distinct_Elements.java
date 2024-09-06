import java.util.*;

public class Distinct_Elements {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
