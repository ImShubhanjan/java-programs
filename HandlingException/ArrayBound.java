package HandlingException;

public class ArrayBound {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nBeyond Array Pointing");
        }
        System.out.println("Will execute if no exception");
    }
}
