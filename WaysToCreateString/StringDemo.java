package WaysToCreateString;

public class StringDemo {
    public static void main(String[] args) {
    String s1 = "Hello"; //1st

    String s2 = new String("Not Hello"); //2nd

    char c[] = {'O','h','G','o','d'};  //3rd
    String s3 = new String(c);         //3rd 

    byte b[] = {65,66,77};    //4th
    String s4 = new String(b);//4th

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    }
}
