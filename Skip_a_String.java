public class Skip_a_String {
    public static void main(String[] args) {
        String str = "bcdapplefg";
        System.out.println(skip(str));
    }
    static String skip(String str) {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")) {
            return skip(str.substring(5));
        }
        else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}
