package p2;
import p1.A;
class D extends A
{
    void display()
    {
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}
class E extends D
{
    void display()
    {
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}
class F
{
    void display()
    {
        A a=new A();
        System.out.println(a.a);
//        System.out.println(a.b);
//        System.out.println(c);
//        System.out.println(d);
    }
}
public class file2
{
    public static void main(String args[])
    {
        D d=new D();
        E e=new E();
        F f=new F();
        A a = new A();
//        a.display();
        d.display();
        e.display();
        f.display();
    }
}