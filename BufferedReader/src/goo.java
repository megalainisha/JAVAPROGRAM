import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goo
{
  String s;
  int b;
  float d;
  char c;
  BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
  
  void output() throws IOException
  {
	  System.out.println("Enter the values\n");
	  s=n.readLine();
	  b=Integer.parseInt(n.readLine());
	  d=Float.parseFloat(n.readLine());
	  c=n.readLine().charAt(0);
  }
  void display()
  {
	  System.out.println("The values are \n"+s+"\n"+b+"\n"+d+"\n"+c);
  }
}
class doo
{
	public static void main(String[] args) throws IOException 
	{
		goo g=new goo();
		g.output();
		g.display();

	}

}
