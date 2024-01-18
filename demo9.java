class A
{
	void At()
	{
		this.At(10);
		System.out.println("A() ");
		
	}
	void At(int a)
	{
		this.At(10, "Chinmay");
		System.out.println("A(int a) ");
	}
	void At(int a, String name)
	{
		System.out.println("A(int a, string) ");
	}

}
class demo9
{
	public static void main(String args[])
	{	
		A a = new A();
		a.At();
	}
}