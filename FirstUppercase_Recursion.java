public class FirstUppercase_Recursion {
    public static void main(String[] args) {
        String str = "geeKs";
        System.out.println(answer(str));
    }
    static char answer(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        if(Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }
        return answer(str.substring(1));
    }
}
