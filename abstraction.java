abstract class Bank
{
	abstract void loan();
}

class B extends Bank
{
	void loan()
	{
		
		System.out.println("methods, home, gold, property");
	}
}
public class abstraction 
{
	public static void main(String args[])
	{
		B b = new B();
		b.loan();
	}
}