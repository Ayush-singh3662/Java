import java.util.*;
//half solved.

public class Intinerary {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mumbai","Goa");
        map.put("Goa","Delhi");
        map.put("Delhi", "Bengaluru");
        String start = start(map);
        while(map.containsKey(start)) {
            System.out.print(start+"->");
            start = map.get(start);
        }
        System.out.println(start);
    }

    public static String start(HashMap<String, String> map) {
        HashMap<String, String> revmap = new HashMap<>();
        for(String key : map.keySet()) {
            revmap.put(map.get(key),key);
        }
        for(String s : map.keySet()) {
            if(!revmap.containsKey(s)) {
                return s;
            }
        }
        return null;
    }
}
