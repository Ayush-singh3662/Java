import java.util.ArrayList;

public class Subset_Recursion {
    public static void main(String[] args) {
        String ans = "", str = "abc";
        subset(ans, str);
        System.out.println();
        System.out.println(subset2(ans, str));
    }
    static void subset(String ans, String str) {
        if(str.isEmpty()) {
            System.out.print(ans + " ");
            return ;
        }
        char ch = str.charAt(0);
        subset(ans + ch, str.substring(1));
        subset(ans, str.substring(1));
    }
    //Returning an ArrayList
    static ArrayList<String> subset2(String ans, String str) {
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subset2(ans+ch, str.substring(1));
        ArrayList<String> right = subset2(ans, str.substring(1));
        left.addAll(right);
        return left;
    }
}