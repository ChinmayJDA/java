import java.util.Scanner;

class emp
{
	String name;
	int id, age;
	String desig;
	double salary;
	emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		id=sc.nextInt();
			
		System.out.println("Enter name:");
		name=sc.next();

		System.out.println("Enter age:");
		age=sc.nextInt();

		//display();
	}

	
}
class Developer extends emp
{
	int flag = 0;
	Developer()
	{
		desig="Developer"; 
		salary=50000;
	}
	void display()
	{
		System.out.println("Your ID:"+id);
		System.out.println("Your name:"+name);
		System.out.println("Your title:"+desig);
		System.out.println("Your salary:"+salary);
		System.out.println("Your age:"+age);
	} 
        void RaiseSalary()
	{
		if(flag <1)
		{
			salary = salary + 0.15*salary;
			System.out.println("Salary Raised");
			flag++;
		}
		else{
			System.out.println("Caution, Salary already raised");
		}
	}
	
}
class Clerk extends emp
{
	int flag = 0;
	Clerk()
	{
		desig="Clerk"; 
		salary=25000;
	}
	void display()
	{
		System.out.println("Your ID:"+id);
		System.out.println("Your name:"+name);
		System.out.println("Your title:"+desig);
		System.out.println("Your salary:"+salary);
		System.out.println("Your age:"+age);
	} 
	void RaiseSalary()
	{
		if(flag <1)
		{
			salary = salary + 0.05*salary;
			System.out.println("Salary Raised");
			flag++;
		}
		else{
			System.out.println("Caution, Salary already raised");
		}
	}
}
class Manager extends emp
{
	int flag = 0;
	Manager()
	{
		desig="Manager"; 
		salary=70000;
	}
	void display()
	{
		System.out.println("Your ID:"+id);
		System.out.println("Your name:"+name);
		System.out.println("Your title:"+desig);
		System.out.println("Your salary:"+salary);
		System.out.println("Your age:"+age);
	} 
	void RaiseSalary()
	{
		if(flag <1)
		{
			salary = salary + 0.20*salary;
			System.out.println("Salary Raised");
			flag++;
		}
		else{
			System.out.println("Caution, Salary already raised");
		}
	}
}
class Tester extends emp
{
	int flag = 0;
	Tester()
	{
		desig="Tester"; 
		salary=40000;
	}
	void display()
	{
		System.out.println("Your ID:"+id);
		System.out.println("Your name:"+name);
		System.out.println("Your title:"+desig);
		System.out.println("Your salary:"+salary);
		System.out.println("Your age:"+age);
	} 
	void RaiseSalary()
	{
		if(flag <1)
		{
			salary = salary + 0.05*salary;
			System.out.println("Salary Raised");
			flag++;
		}
		else{
			System.out.println("Caution, Salary already raised");
		}
	}
}
class demo4
{
	public static void main(String args[])
	{
		int ch1=0;
		Scanner sc=new Scanner(System.in);
		Developer d=null;
		Clerk c=null;
		Manager m=null;
		Tester t=null;
		do
		{	
			System.out.println("1) Create ");
			System.out.println("2) Display ");
			System.out.println("3) Raise Salary ");
			System.out.println("4) Exit ");
			ch1=sc.nextInt();
			int ch2=0;
			if(ch1==1)
			{
				System.out.println("1) Developer ");
				System.out.println("2) Clerk ");
				System.out.println("3) Manager ");
				System.out.println("4) Tester ");
				System.out.println("5) EXIT ");
				do
				{
			
					ch2=sc.nextInt();

					if(ch2==1)
					{
						d=new Developer();
					}
					else if(ch2==2)
					{
						c=new Clerk();
					}
					else if(ch2==3)
					{
						m=new Manager();
					}
					else if(ch2==4)
					{
						t=new Tester();
					}
					else if(ch2==5)
					{
						System.out.println("THANKS!!!!");
						break;
					}
				}while(ch2!=5);
			}
			else if(ch1==2)
			{
				System.out.println("1) Developer ");
				System.out.println("2) Clerk ");
				System.out.println("3) Manager ");
				System.out.println("4) Tester ");
				System.out.println("5) EXIT ");
				
				do
				{
			
					ch2=sc.nextInt();

					if(ch2==1)
					{
						d.display();
					}
					else if(ch2==2)
					{
						c.display();
					}
					else if(ch2==3)
					{
						m.display();
					}
					else if(ch2==4)
					{
						t.display();
					}
					else if(ch2==5)
					{
						System.out.println("THANKS!!!!");
						break;
					}
				}while(ch2!=5);
			}
			else if(ch1==3)
			{
				System.out.println("1) Developer ");
				System.out.println("2) Clerk ");
				System.out.println("3) Manager ");
				System.out.println("4) Tester ");
				System.out.println("5) EXIT ");
				
				do
				{
			
					ch2=sc.nextInt();

					if(ch2==1)
					{
						d.RaiseSalary();
						
					}
					else if(ch2==2)
					{
						c.RaiseSalary();
						
					}
					else if(ch2==3)
					{
						m.RaiseSalary();
						
					}
					else if(ch2==4)
					{
						t.RaiseSalary();
						
					}
					else if(ch2==5)
					{
						System.out.println("THANKS!!!!");
						break;
					}
				}while(ch2!=5);
			}
			else if(ch1==4)
			{
				System.exit(0);
			}
		}while(ch1!=4);
	
	}
}