import java.util.*;
import java.util.Queue;

public class Nonrepeating {
    public static void main(String[] args) {
        String str = "aabccxb";
        ans(str);
    }

    public static void ans(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
            q.add(s.charAt(i));
            freq[s.charAt(i)-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.print(-1+" ");
            }
            else {
                System.out.print(q.peek()+" ");
            }
        }
    }
}
