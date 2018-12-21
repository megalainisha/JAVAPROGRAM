import java.util.Scanner;

public class foo 
{
	Scanner s=new Scanner(System.in);
	void get()
	{
	  int i;
	  System.out.println("Enter the number");
	  i=s.nextInt();
	 /* if(i%2==0)
	  {
		  System.out.println("The number is even  "+i);
	  }
	  else
	  {
		  System.out.println("The number is odd   "+i);
	  }*/
	  for(int n=0;n<=i;n++)
	  {
		  if(n%2==0)
		  {
			  System.out.println("The number is even "+n);
		  }
		  else
		  {
			  System.out.println("The number is odd "+n);
		  }
	  }
	}

}

class g1
{
	public static void main(String a[])
	{
		foo f=new foo();
		f.get();
	}
}
