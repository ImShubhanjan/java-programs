package StringTokenizerDemo;

import java.util.StringTokenizer;

public class StringTokenDemo {
    public static void main(String[] args) {
        String str = "Hello this is Laptop";
        String str1 = "Hello-this-is-Laptop-here";

        // StringTokenizer s = new StringTokenizer(str);
        StringTokenizer s1 = new StringTokenizer(str1,"-"); //one extra argument is their boolean if true is given 
                                                            //the delimiter is also returned in the console.

        // while(s.hasMoreTokens()) {
        //     System.out.print(s.nextToken());  //removes the delimiter by default
        // }
        while(s1.hasMoreTokens()) {
            System.out.print(s1.nextToken()); 
        }
    }
}
