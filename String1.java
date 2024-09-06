import java.util.Arrays;

public class String1 {
    public static void main(String[] args){
        // // System.out.println("      Ayush     ".strip());
        // // System.out.println("Ayush".toLowerCase());
        // // System.out.println(Arrays.toString("Ayush Kumar Singh".split(" ")));
        // // System.out.println("Ayush".indexOf('s'));
        // // System.out.println("Ayush".toCharArray());
        // // System.out.println("Ayush ()".replace("()", "Singh"));
        // String str1 = "ayush";
        // String str2 = "Shivam";
        // // System.out.println(str1.compareTo(str2));
        // System.out.println(str2.compareTo(str1));
        // System.out.println(str1.compareTo(str1));
        // System.out.println(str1.substring(1));
        // String name =  "Ayush Kumar";
        // int i = 1001;
        // System.out.println(String.valueOf(i));
        // String str1 = "Ayush";
        // String str2 = "Shivam";
        // System.out.println(str1+str2);
        // System.out.println("    Ayush       ".strip());
        // System.out.println("        Shivam      ".trim());
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str1.compareToIgnoreCase(str2));
        // char ch = '0';
        // for(int i=0; i<26; i++){
        //     ch = (char)('a'+i);
        //     System.out.print(String.valueOf(ch));
        // }
        String name = "Ayush";
        // for(int i=0; i<26; i++){
        //     char ch = (char)('a'+i);
        //     name += ch;
        // }
        // System.out.println(name);
        char[] naam = {'A','y','u','s','h'};
        // // for(int i=0; i<naam.length(); i++){
        // //     System.out.print(naam.charAt(i));
        // // }
        // System.out.println(name.contentEquals(naam));
        System.out.println(name.copyValueOf(naam));
        // char ch = ' ';
        System.out.println(name.endsWith("h"));
        System.out.println(name.hashCode());
        System.out.println(name.indexOf('A', 0));
        System.out.println(name.indexOf("h",1));
        System.out.println(name.length());
        int i = name.length();
        System.out.println(name.replace('A','S'));
        System.out.println(name.replaceAll("Ayush", "Shivam"));
        System.out.println(name.replaceFirst("Ayush", "Shivam"));
        System.out.println(name.split("u"));
        System.out.println(name.startsWith("A"));
        name.toCharArray();
        name.toLowerCase();
        System.out.println(name.toString());
        name.toUpperCase();
    }
}
