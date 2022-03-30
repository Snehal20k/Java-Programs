package abstract_1;

public class B extends A
{
	
	@Override
	public void get() 
	{
		System.out.println("Get method of class A");
	}

	@Override
	public void display() 
	{
		System.out.println("Display method of class A");
		
	}
	public void get_sal() 
	{
		float gross=(float) (emp_sal+(emp_sal*0.05));
		System.out.println("Employee Salary :"+gross);
		
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.get();
		b1.display();
		b1.get_sal();

	}


	


}
