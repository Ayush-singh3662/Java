import java.util.ArrayList;

public class Permutations_Recursion {
    public static void main(String[] args) {
        String str = "abc", ans = "";
        permutations(ans, str);
        System.out.println();
        System.out.println(permutations2(str, ans));
        System.out.println(permutations3(str, ans));
    }
    
    //Solved using void return type recursive functions
    static void permutations(String ans, String str) {
        if(str.isEmpty()) {
            System.out.print(ans + " ");
            return ;
        }
        char ch = str.charAt(0);
        for(int i=0; i<=ans.length(); i++) {
            String f = ans.substring(0, i);
            String l = ans.substring(i, ans.length());
            permutations(str.substring(1), f+ch+l);
        }
    }

    //Solved using ArrayList return type recursive functions
    static ArrayList<String> permutations2(String str, String ans) {
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0; i<=ans.length(); i++) {
            String f = ans.substring(0, i);
            String l = ans.substring(i, ans.length());
            list2.addAll(permutations2(str.substring(1), f+ch+l)); //f, l & ch can be added in any order. Here, the order of permutations will get differ but the answer will be same.
        }
        return list2;
    }

    //solved by counting the no. of recursive calls
    static int permutations3(String ans, String str) {
        if(str.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        for(int i=0; i<=ans.length(); i++) {
            String f = ans.substring(0, i);
            String l = ans.substring(i, ans.length());
            count = count + permutations3(str.substring(1), l+f+ch);
        }
        return count;
    }
}
