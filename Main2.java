import java.util.*;

public class Main2 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = s.nextInt();
            int[] item = new int[n];
            for (int i = 0; i < n; i++) {
                item[i] = s.nextInt();
            }
            int j = 0, max = 0;
            int itemType = item[0];
            while (j < n) {
                int c = 1;
                int k = j + 1;
                while (k < n) {
                    if (item[j] == item[k] && k != j + 1) {
                        c += 1;
                        if (k < n - 1 && item[k] == item[k + 1]) {
                            k += 1;
                        }
                    }
                    k += 1;
                }
                if (max < c) {
                    max = c;
                    itemType = item[j];
                }
                j += 1;

            }
            System.out.println(itemType);
        }
        s.close();
    }

}