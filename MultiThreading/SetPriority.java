package MultiThreading;

public class SetPriority extends Thread {
    public static void main(String[] args) {
        SetPriority s = new SetPriority();
        s.setPriority(MIN_PRIORITY);
        s.setName("s");
        s.start();
        SetPriority s1 = new SetPriority();
        s1.setPriority(MAX_PRIORITY);
        s1.setName("s1");
        s1.start();
    }
    public void run() {
        System.out.println("Thread is: " +Thread.currentThread().getName());
    }
}
