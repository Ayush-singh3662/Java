import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "tulip", t = "lipid";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            // if(hm.containsKey(s.charAt(i))) {
            //     hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            // }
            // else {
            //     hm.put(s.charAt(i), 1);
            // }

            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            if(hm.containsKey(t.charAt(i))) {
                hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
                if(hm.get(t.charAt(i)) == 0) {
                    hm.remove(t.charAt(i));
                }
            }
            else {
                System.out.println(false);
                return ;
            }
        }
        System.out.println(hm.isEmpty());
    }
}
