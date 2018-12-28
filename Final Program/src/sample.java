import java.util.Scanner;

public class sample 
{
	final int p=100;
	Scanner s=new Scanner(System.in);
	void input()
	{
		//System.out.println("Enter the value");
		//p=s.nextInt();
		System.out.println("Base class"+p);
	}
}
class dervied extends sample
{
	void get()
	{
		//p++;
		System.out.println("Derived class"+p);
	}
}
class demo
{
	public static void main(String[] args) 
	{
		dervied d=new dervied();
		d.input();
		d.get();
	}

}
