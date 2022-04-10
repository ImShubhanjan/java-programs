package MultiThreading;

public class SingleThread {
    public static void main(String[] args) {
        //secondLoop
        SingleThread s = new SingleThread();
        s.FirstLoop();
        for(int j=0; j<=10; j++) {
            System.out.print("j->"+j+"\t") ;
        }       
    }

    void FirstLoop() {
        for(int i=0; i<=10; i++) {
            System.out.print("i->"+i+"\t") ;
        }
    }
}
