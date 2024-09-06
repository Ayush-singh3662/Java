import java.util.HashMap;
import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); ++i) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        char c = 'a';
        for(char x : map.keySet()) {
            if(map.get(x) > max) {
                max = map.get(x);
                c = x;
            }
        }
        System.out.println(c);
        sc.close();
    }
}