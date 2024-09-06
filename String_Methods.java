public class String_Methods {
    public static void main(String[] args) {
        String str = "xyz@gmail.com";
        System.out.println(str.matches(".*gmail.*")); 
        int i = str.indexOf("@");
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i+1));
    }
}
