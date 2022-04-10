package MultiThreading;

public class SynchronizedClass {
    public static void main(String[] args) {
        SayHello sh = new SayHello();
        SayHello sh2 = new SayHello();

        sh.Greet("Shubhu");
        sh2.Greet("Mclin");
    }
}

class SayHello {
    public synchronized void Greet(String name) {
        System.out.println("Hello: " + name);
    }
}
