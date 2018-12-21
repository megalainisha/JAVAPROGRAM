abstract class d1
{
	int p=10;
	public void g1()
	{
		System.out.println("Welcome to Normal Method");
	}
	abstract public void g2();
}
class demo extends d1
{
 public void g2()
 {
	 System.out.println("Welcome to Abstract class");
 }
}
class demo1
{
	public static void main(String[] args)
	{
		d1 g=new demo();
		g.g1();
		g.g2();
	}

}
