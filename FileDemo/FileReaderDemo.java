package FileDemo;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {
    public static void main(String[] args)throws Exception {
        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("C:/Users/Shubhanjan Barai/Desktop/myRepo/Text.txt");
        fw = new FileWriter("C:/Users/Shubhanjan Barai/Desktop/myRepo/NewText.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
        System.out.println("File Closed");
    }
}
