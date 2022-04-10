package MultiThreading;

public class MultiThreadingClass extends Thread{
    public static void main(String[] args) {
        MultiThreadingClass s = new MultiThreadingClass();
        s.start();
        for(int j=0; j<=10; j++) {
            System.out.print("j->"+j+"\t") ;
        }
    }
    public void run(){
        for(int i=0; i<=10; i++) {
            System.out.print("i->"+i+"\t") ;
        }
    }
}
