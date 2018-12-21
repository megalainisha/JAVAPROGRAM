import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum 
{
  int n,rem,s,d;
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  
  void get1() throws NumberFormatException, IOException
  {
	  System.out.println("Enter the number");
	  n=Integer.parseInt(b.readLine());
	  d=n;
	  while(n>0)
	  {
		  rem=n%10;
		  s=s+rem*rem*rem;
		  n=n/10;
	  }
	  if(d==s)
	  {
		  System.out.println("The give number is armstrong");
	  }
	  else
	  {
		  System.out.println("The give number is not armstrong");
	  }
	  
  }
}
class demo
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		sum h=new sum();
		h.get1();

	}

}
