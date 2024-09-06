import java.util.HashMap;

public class Pick_Toys {

    // https://www.youtube.com/watch?v=seOKHXB_w74&list=PL_z_8CaSLPWeM8BDJmIYDaoQ5zuwyxnfj&index=12&ab_channel=AdityaVerma

    public static void main(String[] args) {
        String s = "aaaaa";
        System.out.println(pick(s));
    }

    private static int pick(String s) {
        int left = 0, right = 0, len = s.length(), max = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right < len) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            if(map.size() == 2) {
                max = Math.max(max, right-left+1);
            }
            else if(map.size() > 2) {
                while(map.size() > 2) {
                    map.put(s.charAt(left), map.get(s.charAt(left))-1);
                    if(map.get(s.charAt(left)) == 0) {
                        map.remove(s.charAt(left));
                    }
                    left++;
                }
            }
            right++;
        }
        return max;
    }
}
