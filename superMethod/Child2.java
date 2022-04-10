package superMethod;

public class Child2 extends Parent1 {
    int c,d;
    public Child2(int a, int b, int c, int d) {
        super(a,b);
        this.c = c;
        this.d = d;
    }
    public void display() {
        System.out.println("A: "+super.a);
        System.out.println("B: "+super.b);
        System.out.println("C: "+this.c);
        System.out.println("D: "+this.d);


    }
}
