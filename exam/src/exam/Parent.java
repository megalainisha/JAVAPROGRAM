package exam;

public class Parent
{
	
	void display()
	{
		System.out.println("Parent");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("Child");
	}
}

class Test{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Parent p=new Parent();
       Child c=(Child)p;
       c.display();
		
	}

}
