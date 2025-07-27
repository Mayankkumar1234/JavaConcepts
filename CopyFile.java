import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try (FileInputStream r = new FileInputStream("read.bin");
             FileOutputStream w = new FileOutputStream("write.bin")) {

            // Buffer to hold the data 
            byte[] buffer = new byte[1024];
            int i;
            while ((i = r.read(buffer)) != -1) {
                w.write(buffer, 0, i);
            }
            System.out.println("Data copied successfully...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
