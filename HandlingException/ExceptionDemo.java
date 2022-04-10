package HandlingException;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integer: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
        System.out.println("Divide: " + a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("You have entered");
        }
        System.out.println("Will Execute if no Exception");
    }
}
