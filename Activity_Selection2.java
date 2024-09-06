import java.util.*;

public class Activity_Selection2 {
    public static void main(String[] args) {
        // int[] start = {3, 4, 2, 6, 8, 1};
        // int[] end = {5, 6, 3, 2, 4, 2};
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int[][] activities = new int[start.length][3];
        for(int i=0; i<activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //lambda function(Comparator)
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1, over = activities[0][2];
        list.add(activities[0][0]);
        for(int i=1; i<start.length; i++) {
            if(activities[i][1] >= over) {
                count++;
                list.add(activities[i][0]);
                over = activities[i][2];
            }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
