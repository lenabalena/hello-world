import java.util.*;
public class HelloWorld {
    public void helloName()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name.");
        String name=in.next();
        System.out.println("Hello "+name+" !");
    }
    public static void main(String[] args) {
       HelloWorld helloname=new HelloWorld();
       helloname.helloName();
    }
}
