import java.util.*;

public class T1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
        int n = sc.nextInt();
        String[] a = new String[n];
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<n; ++i) {
          a[i] = sc.next();
          if(!Character.isDigit(a[i].charAt(0))) {
            set.add(a[i].charAt(0));
          }
        }
        System.out.println(solve(n, a, set));
      }
      sc.close();
    }
    
    private static int solve(int n, String[] a, HashSet<Character> set) {
      HashMap<Character, Integer> m = new HashMap<>();
      for(int i=0; i<n; ++i) {
        for(int j=0; j<a[i].length(); ++j) {
          if(Character.isDigit(a[i].charAt(j))) {
            continue;
          }
          m.put(a[i].charAt(j), m.getOrDefault(a[i].charAt(j), 0) + 1);
        }
      }
      TreeMap<Integer, Character> map = new TreeMap<>(Collections.reverseOrder());
      for(char x : m.keySet()) {
        map.put(m.get(x), x);
      }
      int p = 1;
      HashMap<Character, Integer> val = new HashMap<>();
      boolean flag = true;
      for(int x : map.keySet()) {
        char c = map.get(x);
        if(!set.contains(c) && flag) {
          val.put(c, 0);
          flag = false;
        } else if(flag) {
          val.put(c, p++);
        }
      }
      int sum = 0;
      for(int i=0; i<a.length; ++i) {
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<a[i].length(); ++j) {
          char c = a[i].charAt(j);
          if(!Character.isDigit(a[i].charAt(j))) {
            sb.append(val.get(c));
            continue;
          }
          sb.append(c);
        }
        sum += Integer.valueOf(sb.toString());
      }
      return sum;
    }
  }