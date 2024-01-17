class A
{
	int a, salary;
	A()
	{
		salary = 20000;
		System.out.println("A class");
	}
}

class B extends A
{
	B()
	{
		salary = 50000;
		System.out.println("B class" + a);
		System.out.println("B salary" + salary);
	}
}
public class inheritance 
{
	public static void main(String args[])
	{
		B b = new B();
	}
}


/* Inheritance
->	Speed, storage  By default, only default constructor of parent is
 called from the child. Not parametrized constructor.
-> 	We can only assign values to variables in child constructor when they are 
declared in the parent class.
-> 	Multiple inheritance is not allowed in java
*/