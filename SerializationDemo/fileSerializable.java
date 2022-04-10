package SerializationDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class fileSerializable
{
    public static void main(String[] args) {
        
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            fos = new FileOutputStream("C:/Users/Shubhanjan Barai/Desktop/myRepo/Stu.ser");
            oos = new ObjectOutputStream(fos);
            
            Employee emp = new Employee("Shubhu",22,100000,12345);
            oos.writeObject(emp);
            System.out.println("File Serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}