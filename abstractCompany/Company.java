package abstractCompany;

public abstract class Company {
    void commonLine(String str) {
        System.out.println("Welcome to the " +str+" portal");
    }

    abstract void tagLine();
}