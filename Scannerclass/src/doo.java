import java.util.Scanner;

public class doo 
{
  String s;
  int a;
  float f;
  Scanner g=new Scanner(System.in);
     void get()
     {
        System.out.println("Enter the details");
        a=g.nextInt();
        f=g.nextFloat();
        s=g.next();
        System.out.println("details..........\n"+s+"\n"+a+"\n"+f);
     }
}
class foo
{
	public static void main(String a[])
	{
		doo d=new doo();
		d.get();
	}
}
