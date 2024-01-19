import java.util.Scanner;
import java.util.*;
public class exception {
    public static void main(String args[])
    {
        m1();
    }
    static void m1()
    {
        m2();
        System.out.println("M1 calling");
    }

    static void m2()
    {
        m3();
        System.out.println("M2 calling");
    }
    static void m3()
    {
        try
        {
            System.out.println("M3 cLLING");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter A");
            int a = sc.nextInt();
            System.out.print("Enter B:");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result is: "+c);
        }
        catch(InputMismatchException io){
            System.out.println("Numbers only");
        }
        catch(ArithmeticException io) {
            System.out.println("Give any number except 0 ");
        }

    }

}
