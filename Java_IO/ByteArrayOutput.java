import java.io.ByteArrayOutputStream;
// import java.io.IOException;
// import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutput {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte[] b = bos.toByteArray();
        for(byte x : b) {
            System.out.print((char)x);
        }
        try{
            bos.writeTo(new FileOutputStream("Test.txt"));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
