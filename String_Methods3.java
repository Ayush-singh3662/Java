public class String_Methods3 {
    public static void main(String[] args) {
        String str = "afwewuah#$^^123@#de12$AS";
        System.out.println(str.replaceAll("\\W", ""));
        String str2 = "abshs  saudsd fjee u";
        System.out.println(str2.replaceAll("\\s+", " ").trim());
        String ans = str2.replaceAll("\\s+", " ");
        String[] words = ans.split("\\s");
        System.out.println(words.length);
    }
}
