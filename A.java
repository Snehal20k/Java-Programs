package abstract_1;

public abstract class A 
{
	int n;
	int emp_sal=10000;
	
	public abstract void get();
	public abstract void display();
	public abstract void get_sal();
	
	public A()
	{
		n=45;
		System.out.println(n);
	}
	
	public void show()
	{
		System.out.println("In shoe method of A class");
	}
}
