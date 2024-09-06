import java.util.*;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            set.add(arr2[j]);
        }
        for(int x : set) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Union = "+set.size());
        set.clear();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for(int j=0; j<arr2.length; j++) {
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
                System.out.print(arr2[j]+" ");
            }
        }
        System.out.println();
        System.out.println("Intersection = "+count);
    }
}
