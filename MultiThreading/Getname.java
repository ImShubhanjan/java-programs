package MultiThreading;

public class Getname extends Thread {
    public static void main(String[] args) {
        Thread curr = Thread.currentThread();
        Getname s = new Getname();
        s.start();
        System.out.println("This is "+curr.getName()+" thread");
        // for(int j=0; j<=10; j++) {
        //     System.out.print("j->"+j+"\t") ;
        // }
    }
    public void run(){
        Thread curr = Thread.currentThread();
        curr.setName("2nd Thread");
        System.out.println("This is "+curr.getName()+" thread");
    }
}

