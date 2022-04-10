package abstractCompany;

public class Test {
    public static void main(String[] args) {
        Persistent p = new Persistent();
        p.commonLine("Persistent");
        p.tagLine();
        IBM i = new IBM();
        i.commonLine("IBM");
        i.tagLine();
        Cognizant c= new Cognizant();
        c.commonLine("Cognizant");
        c.tagLine();
    }
}
