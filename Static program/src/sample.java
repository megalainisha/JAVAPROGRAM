
public class sample 
{
  static int p=10;
  sample()
  {
	  p++;
	  System.out.println(p);
  }
 /* void get()
  {
	  p++;
	  System.out.println(p);
  }*/
}
class demo
{
	public static void main(String[] args)
	{
		new sample();
		new sample();
		/*sample g=new sample();
		sample g1=new sample();
		g.get();
		g1.get();*/
	}

}
