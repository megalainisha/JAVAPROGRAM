import java.util.Scanner;

public class base 
{
   int a,b,c;
   Scanner s=new Scanner(System.in);
   void get() 
   {
	   System.out.println("Enter the a and b values");
	   a=s.nextInt();
	   b=s.nextInt();
	   
	   c=a*b;
	   System.out.println("The Result is "+c);
   }
}
class d1 extends base
{
    int d,f;
    void get1()
    {
    	System.out.println("Enter the d value");
    	d=s.nextInt();
    	
    	f=c+d;
    	System.out.println("Result is "+f);
    }
}
class d2 extends d1
{
	int g,h;
	void get2()
	{
		System.out.println("Enter the g value");
		g=s.nextInt();
		
		h=f-g;
	    System.out.println("Answer is "+h);
	}
}
class demo
{
	public static void main(String[] args) 
	{
		d2 m=new d2();
		m.get();
		m.get1();
		m.get2();

	}

}
