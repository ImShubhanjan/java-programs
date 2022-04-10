package HandlingException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
Use of throws keyword
*/

public class fileReadDemo {
    void readFile() throws FileNotFoundException  {
            FileOutputStream fis = new FileOutputStream("");
    }
    public static void main(String[] args) {
        fileReadDemo f = new fileReadDemo();
        try {
            f.readFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
