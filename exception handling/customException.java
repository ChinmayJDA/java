import java.util.*;
import java.io.*;

class A
{
    void display() throws InvalidAgeException  {
        for (int i = 0; i <= 10; i++)
        {
            if(i==6)
            {
                System.out.println("6InvalidAgeException");
                throw new InvalidAgeException("Invalid integer");
            }
        }
    }
}
class customException
{
    public static void main(String args[])
    {
        try{
            A a = new A();
            a.display();
        }
        catch(InvalidAgeException iva)
        {
            System.out.println("Please enter the proper age "+iva.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class InvalidAgeException extends Exception
{
    InvalidAgeException(String args)
    {
        super(args);
    }
}