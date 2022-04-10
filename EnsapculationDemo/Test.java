package EnsapculationDemo;

public class Test {
    public static void main(String[] args) {
        
    School s = new School();

    s.setName("Shubhu");
    s.setAddress("Kolkata");
    s.setPhone(12345);

    System.out.println("Name: " + s.getName());
    System.out.println("Address: " + s.getAddress());
    System.out.println("Phone: " + s.getPhone());
    }
}
