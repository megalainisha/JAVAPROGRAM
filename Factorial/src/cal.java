import java.io.DataInputStream;
import java.io.IOException;

public class cal
{
  int fact,c,n;
  DataInputStream di=new DataInputStream(System.in);
  
  void input() throws NumberFormatException, IOException
  {
	 System.out.println("Enter the number");
	 n=Integer.parseInt(di.readLine());
	 fact=1;
	 for(c=1;c<=n;c++)
	 {
		 fact=fact*c;
	 }
	 System.out.println("The Factorial of the given number is"+fact);
  }
}
class demo
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		cal n=new cal();
		n.input();
	}

}
