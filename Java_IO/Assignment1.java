import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("Temp1.txt");
        FileOutputStream fw = new FileOutputStream("Temp2.txt");
        int b;
        while((b = fs.read()) != -1) {
            if(b >= 65 && b <= 90)
                fw.write(b+32);
            else {
                fw.write(b);
            }
        }
        fw.close();
        fs.close();
    }
}