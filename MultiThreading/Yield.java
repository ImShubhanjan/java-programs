package MultiThreading;

public class Yield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) 
            System.out.println("Yield Class");
        Thread.yield();  //first
    }

    public static void main(String[] args) {
        Yield y = new Yield();
        y.start();
        for (int i = 0; i < 5; i++) 
            System.out.println("Main Class");
    }
}
