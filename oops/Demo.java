class A
{
      A()
      {
             System.out.println("Constructor Calling");
      } 
      void display()
      {
             System.out.println("Method calling");
      }
}

public class Demo
{
      public static void main(String args[])
      {
             System.out.println("Hi Welcome to BY");
             A a = new A();
             a.display();		
      }
}
