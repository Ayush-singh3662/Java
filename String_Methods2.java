public class String_Methods2 {
    public static void main(String[] args) {
        int i = 10101011;
        String str = String.valueOf(i);
        System.out.println(str.matches("(0|1)+"));
        String hex = "0183383";
        System.out.println(hex.matches("[0-9A-F]+"));
        String date = "13/10/2002";
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}