public class Skip_unique_Strings {
    public static void main(String[] args) {
        String str = "bcdappegfappledapp";
		System.out.println(skip(str));
    }
    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skip(str.substring(3));
        }
        else {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}
