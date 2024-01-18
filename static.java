class A
{
    static int x = 100;
    static void abc(String args)
    {
        System.out.println("Name :" + args);
    }
}
class statix
{
    public static void main(String args[])
    {
        System.out.println(A.x);
        A.abc("Chinmay");
    }
}