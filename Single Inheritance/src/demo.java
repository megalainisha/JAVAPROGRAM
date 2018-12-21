
public class demo
{
  int a=20;
  void get()
  {
	  System.out.println("The base class value is"+a);
  }
}
class demo1 extends demo
{
	void get1()
	{
		System.out.println("The derived class value is"+a);
	}
	
}
class sample
{
	public static void main(String[] args)
	{ 
		demo1 d=new demo1();
		d.get();
		d.get1();
	}

}
