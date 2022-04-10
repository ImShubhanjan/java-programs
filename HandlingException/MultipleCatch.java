package HandlingException;

public class MultipleCatch {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 9;
        a[1] = 3;
        a[2] = 2;
        a[3] = 11;
        a[4] = 0;
        try {
            a[5] = 8;
            System.out.println(a[4]);
            System.out.println(a[0] / a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Bounds Out in the Array");
        }
        catch(ArithmeticException e) {
            System.out.println("You have one element zero");
        }
        System.out.println("Will execute if no exception");
    }
}
