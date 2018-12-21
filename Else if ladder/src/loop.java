import java.io.DataInputStream;
import java.io.IOException;

public class loop 
{
	int p1,p2,p3;
	double d;
	DataInputStream g=new DataInputStream(System.in);
	void out() throws  IOException
	{
	  System.out.println("Enter price details\n");
	  p1=Integer.parseInt(g.readLine());
	  p2=Integer.parseInt(g.readLine());
	  p3=p1+p2;
	  
	  if(p3>=5000)
	  {
		d=p3-(p3*0.1);  
	  }
	  else if(p3>=10000)
	  {
		  d=p3-(p3*0.25);
	  }
	  else if(p3>=25000)
	  {
		  d=p3-(p3*0.5);
	  }
	  else
	  {
		  d=p3-(p3*0.05);
	  }
	  System.out.println("The discount price is "+d);
	}
}
class doo
{
	public static void main(String[] args) throws IOException
	{
		loop l=new loop();
		l.out();
	}

}
