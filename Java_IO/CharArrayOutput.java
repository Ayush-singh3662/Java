import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.FileWriter;

public class CharArrayOutput {
    public static void main(String[] args) {
        CharArrayWriter co = new CharArrayWriter();
        co.write('a');
        co.write('b');
        char[] c = co.toCharArray();
        for(char ch : c) {
            System.out.print(ch);
        }
        try {
            co.writeTo(new FileWriter("Test.txt"));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        co.close();
    }
}
