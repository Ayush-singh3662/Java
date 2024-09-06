import java.util.ArrayList;

public class Water_Container {
    //Conatiner with most water.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
    }

    private static int storeWater(ArrayList<Integer> list) {
        int i = 0, j = list.size()-1;
        int maxCapacity = 0;
        while(i<j) {
            int height = Math.min(list.get(i), list.get(j));
            int width = j-i;
            int currCapacity = height * width;
            maxCapacity = Math.max(maxCapacity, currCapacity);
            if(list.get(i)<list.get(j)) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxCapacity;
    }
}
