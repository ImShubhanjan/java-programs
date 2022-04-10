package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class fileDeSerialization {
    public static void main(String[] args)throws FileNotFoundException,IOException, ClassNotFoundException{

        FileInputStream fis = new FileInputStream("C:/Users/Shubhanjan Barai/Desktop/myRepo/Stu.ser");;
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object ob = ois.readObject();
            Employee emp = (Employee) ob;

           System.out.println("Employee name: " +emp.name);
           System.out.println("Employee age: " +emp.age);
           System.out.println("Employee salary: " +emp.salary);
           System.out.println("Employee ssn: " +emp.ssn);

        }
        
    }
}
