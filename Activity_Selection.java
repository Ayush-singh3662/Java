import java.util.*;

public class Activity_Selection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int count = 1;
        int over = end[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=1; i<start.length; i++) {
            if(start[i] >= over) {
                over = end[i];
                list.add(i);
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
