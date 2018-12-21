import java.util.Scanner;

public class doo
{
  int pid[]=new int[20];
  int i,n;
  Scanner s=new Scanner(System.in);
 
 void get()
 {
	 System.out.println("Enter the n values\n");
	 n=s.nextInt();
	 
	 for(i=0;i<=n;i++)
	 {
		 System.out.println("Enter the array values\n");
		 pid[i]=s.nextInt();
	 }
	 
	 for(i=0;i<=n;i++)
	 {
		 System.out.println("The array values are\n"+pid[i]);
	 }
		 
 }
	
}
class demo
{
	public static void main (String a[])
	{
		doo d=new doo();
		d.get();
	}
}