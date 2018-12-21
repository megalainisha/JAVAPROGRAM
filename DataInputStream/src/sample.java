import java.io.DataInputStream;
import java.io.IOException;

public class sample 
{
	int a;
	float f;
	String s;
	DataInputStream d=new DataInputStream(System.in);
	
	void get() throws NumberFormatException, IOException
	{
		System.out.println("Enter the values\n");
		a=Integer.parseInt(d.readLine());
		f=Float.parseFloat(d.readLine());
		s=d.readLine();
		System.out.println("The values are \n"+s+"\n"+a+"\n"+f);
	}

}
class demo
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		sample j=new sample();
		j.get();

	}

}
