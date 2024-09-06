import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Nepal", 50);
        hm.put("US", 40);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Indonesia"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        // hm.clear();
        // System.out.println(hm.isEmpty());
        // System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String s : keys) {
            System.out.println("Key = "+s+", Value = "+hm.get(s));
        }
    }
}
