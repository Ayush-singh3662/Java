import java.util.ArrayList;

public class Maze2_Recursion {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println();
        System.out.println(path2("", 3, 3));
    }
    static void path(String str, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.print(str + " ");
            return ;
        }
        if(row > 1) {
            path(str+'V', row-1, col);
        }
        if(col > 1) {
            path(str+'H', row, col-1);
        }
        if(row > 1 && col > 1) {
            path(str+'D', row-1, col-1);
        }
    }
    static ArrayList<String> path2(String str, int row, int col) {
        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> list2 = new ArrayList<>();
        if(row > 1) {
            list2.addAll(path2(str+'V', row-1, col));
        }
        if(col > 1) {
            list2.addAll(path2(str+'H', row, col-1));
        }
        if(row > 1 && col > 1) {
            list2.addAll(path2(str+'D', row-1, col-1));
        }
        return list2;
    }
}
