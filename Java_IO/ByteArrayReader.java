import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayReader {
    public static void main(String[] args) throws IOException {
        byte[] b = {'a', 'b', 'c', 'd'};
        ByteArrayInputStream br = new ByteArrayInputStream(b);
        int x;
        while((x = br.read()) != -1) {
            System.out.print((char)x);
        }
        br.close();
    }
}
