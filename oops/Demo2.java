import java.util.Scanner;


class Employee
{
	String name;  // default value -> null
	int id;		// default value -> 0
	Employee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");			//PRINTln -> for word by word
		id = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();	
	}
	
	void display()
	{
		
		System.out.println("My ID is :" + id);
		System.out.println("The name is :"+ name);
		
	}
}

class Demo2
{
      public static void main(String args[])
      {
            	byte b = 2;
		short s = 3;
		int i = 10;
		float f = 10/3f;
		long l = 10/3l;
		double d = 10/3d;
		
System.out.println("" + b);
System.out.println("" +s);
System.out.println("" + i);
System.out.println("" + f);
System.out.println(":" + d);
		Employee e = new Employee();
		e.display();
         		
      }
}
