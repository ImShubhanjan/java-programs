package SerializationDemo;

import java.io.Serializable;

public class Employee implements Serializable{
    String name;
    int age;
    int salary;
    transient int ssn;
    public Employee(String name, int age, int salary, int ssn) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.ssn = ssn;
    }
    
}
