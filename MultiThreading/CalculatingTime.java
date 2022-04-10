package MultiThreading;

import java.util.Scanner;

public class CalculatingTime extends Thread {
    static int n, sum=0;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        JoinDemo.n = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum is "+JoinDemo.sum);
        long end = System.currentTimeMillis();

        System.out.println("The time Taken is: "+ (end-start)/1000 + " Seconds");
        
    }
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < JoinDemo.n; i++) {
            JoinDemo.sum += i;
        }
    }
}
