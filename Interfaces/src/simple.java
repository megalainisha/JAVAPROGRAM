

interface B
{
	int a=10;
	void g1();
	void g2();
}
public class simple implements B
{
	public void g1()
	{
	System.out.println("Welcome...");	
	}
	public void g2()
	{
		System.out.println("hello...");
	}
}
class demo
{
	public static void main(String[] args)
	{
		simple h=new simple();
		h.g1();
		h.g2();

	}

}
