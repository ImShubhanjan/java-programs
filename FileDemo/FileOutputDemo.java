package FileDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:/Users/Shubhanjan Barai/Desktop/myRepo/Text.txt");  
            fos = new FileOutputStream("C:/Users/Shubhanjan Barai/Desktop/myRepo/NewText.txt");
            int i;
            while ((i = fis.read()) != -1) {
                fos.write((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();   
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("File Closed");
        }
    }
}
