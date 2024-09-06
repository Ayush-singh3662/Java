import java.util.ArrayList;

public class Subset_Ascii_Recursion {
    public static void main(String[] args) {
        String str = "abc", ans = "";
        ascii(ans, str);
        System.out.println();
        System.out.println(ascii2(ans, str));
    }
    static void ascii(String ans, String str) {
        if(str.isEmpty()) {
            System.out.print(ans + " ");
            return ;
        }
        char ch = str.charAt(0);
        ascii(ans+ch, str.substring(1));
        ascii(ans, str.substring(1));
        ascii(ans + (ch+0), str.substring(1));
    }
    //Return an ArrayList.
    static ArrayList<String> ascii2(String ans, String str) {
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> first = ascii2(ans + ch, str.substring(1));
        ArrayList<String> second = ascii2(ans, str.substring(1));
        ArrayList<String> third = ascii2(ans + (ch+0), str.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
