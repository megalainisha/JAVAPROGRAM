import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;

 class Sample
{
	/*private int x=7;
	public void makeInner()
	{
		MyInner in=new MyInner();
		in.seeOuter();
		
	}
	class MyInner
	{
		public void seeOuter()
		{
			int x=8;
			System.out.println("Inner x is"+x);
			System.out.println("outer class x is"+this.x);
		}
	}*/
/*class sample
{
	
	/*public static void main(String[] args)
	{
		String result;
		int w=2;
		switch(w)
		{
		case 0:
			result="0";
		break;
		case 1:
			result="1";
			break;
		case 2:
			result="2";
		default:
				result="defalut";
				
		}
		System.out.println(result);
		/*TreeMap<Integer,String> tMap=new TreeMap<>();
		tMap.put(1, "NORTH");
		tMap.put(3, "EAST");
		tMap.put(2, "SOUTH");
		tMap.put(3, "WEST");
		System.out.println(tMap.get(2));
		System.out.println(tMap);*/
		
		/*Set<String> set=new TreeSet<>();
		set.add("pink");
		set.add("red");
		set.add("blue");
		Set.add("blue");
		*/
		
		/*Sample.MyInner inner=new Sample().new MyInner();
		inner.seeOuter();
	}*/
   /* static int i=1;
    Sample()
    {
    	i++;
     }
    public static void main(String[] args)
    {
       Sample a=new Sample();
       Sample b=new Sample();
       System.out.println(i);
    }
    */
	
	//public static void main(String[] args)
	//{
		/*int flag;
		do
		{
			try
			{
				int a=5/0;
				flag=0;
				throw new NullPointerException;
			}
			finally
			{
				System.out.println("Performing division");
				flag=1;
			}
		}
		while(flag==1);*/
		public static void main(String args[])
		{
		/*JFrame f=new JFrame("Sample");
		f.setBounds(250, 100, 350, 400);
		f.setVisible(true);*/
		}
		/*Pattern myPattern=Pattern.compile("[a-z&&[^c-e]]at");
		Matcher myMatcher=myPattern.matcher("cat");
		boolean myBoolean=myMatcher.matches();
		System.out.println(myBoolean);
	}*/



/*interface Animal
{
	public abstract void eat();
	public void sleep();
}*/

/*interface Shape
{
	void drawShape();


 class Sample implements Shape
{
	public void drawShape()
	{
		System.out.println("Drawing circle");
	}
	
	public static void main(String[] args)
	
	{
		Shape c=new Sample();
		c.drawShape();
	}*/
	
	
  /*public String strA="String A";
  protected String strB="String b";
  String strC="String c";
}

 class SampleSub  extends Sample
 {
	 void callMethods()
	 {
		 System.out.println(strA);
		 System.out.println(strB);
		 System.out.println(strC);
	 }

	public static void main(String[] args)
	{
		SampleSub ss=new SampleSub();
		ss.callMethods();

	}*/

	
	
	/*public float average(int...nums)
	{
		int sum=0;
		for(int x:nums)
		{
			sum +=x;
		}
		return ((float)sum/nums.length);
	}
	
	public static void main(String[] args)
	{
		Sample s=new Sample();
	
		float avg=s.average(2,5,5);
		System.out.println(avg);
	}*/
	
	/*public void eat()
	
	{
	    System.out.println("Mammal eats");	
	}
	
	public void sleep()
	{
		System.out.println("Mammal sleeps");
	}
	
	public static void main(String[] args)
	{
		Sample s=new Sample();
		s.eat();
		s.sleep();
	}*/
}
