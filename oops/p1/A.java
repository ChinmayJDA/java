package p1;

public class A {
    public int a = 100;
    private int b = 200;
    protected int c = 300;
    int d = 400;

    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class B extends A
{
    void display()
    {
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
