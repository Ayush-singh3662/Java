import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] price = {60, 100, 120};
        int max = 50;
        double[][] ratio = new double[wt.length][2];
        for(int i=0; i<wt.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = price[i]/wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = max;
        for(int i=ratio.length-1; i>=0; i--) {
            
            
        }
    }
}
