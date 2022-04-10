package MultiThreading;

public class Sleep extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Sleep s = new Sleep();
        s.start();
        for(int j=0; j<=10; j++) {
            System.out.print("j->"+j+"\t") ;
            Thread.sleep(3000);
        }
    }
    public void run(){
        for(int i=0; i<=10; i++) {
            System.out.print("i->"+i+"\t") ;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
