interface A
{
	int a=10;
	void g1();
}
interface B extends A
{
	void g2();
}
public class sample implements B
{
public void g1()
 {
	 System.out.println("Welcome...");
 }
 public void g2()
 {
	 System.out.println("The value is "+a);
 }
}
class demo
{
	public static void main(String[] args) 
	{
	 sample h=new sample();
	 h.g1();
	 h.g2();

	}

}
