package CustomException;

import java.util.Scanner;

public class UncheckedException extends RuntimeException{

    UncheckedException(String message) {
        super(message);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        if(b != 0) {
            int c = a/b;
            System.out.println("The answer: " + c);
        }
        else {
            throw new UncheckedException("Denominator is Zero");
        }
    }
}
