package interfaceinjava;

public class Demo implements A
{
	public void get_details()
	{
		System.out.println("Emp_id "+emp_id);
	}
	public void get_salary()
	{
		System.out.println("Emp_sal "+emp_sal);
	}

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.get_details();
		d.get_salary();

	}

}
