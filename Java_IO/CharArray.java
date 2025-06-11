import java.io.IOException;
import java.io.CharArrayReader;

public class CharArray {
    public static void main(String[] args) {
        try {
            char[] c = {'a', 'b', 'c', 'd'};
            CharArrayReader cr = new CharArrayReader(c);
            int x;
            while((x = cr.read()) != -1) {
                System.out.print((char)x);
            }
            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
