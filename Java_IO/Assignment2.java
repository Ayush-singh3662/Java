import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Assignment2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fs1 = new FileInputStream("Temp1.txt");
        FileInputStream fs2 = new FileInputStream("Temp2.txt");
        SequenceInputStream si = new SequenceInputStream(fs1, fs2);
        FileOutputStream fw = new FileOutputStream("Destination.txt");
        int b;
        while((b = si.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fs1.close();
        fs2.close();
        si.close();
    }
}
