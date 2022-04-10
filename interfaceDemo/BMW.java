package interfaceDemo;

public class BMW implements Car {

    @Override
    public void accelarator() {
        System.out.println("In accelarator");
    }

    @Override
    public void brake() {
        System.out.println("In Brake");
    }
}
