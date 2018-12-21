import java.util.Scanner;

public class good 
{
	int n,rev;
	Scanner s=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the number");
		n=s.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
		}
		System.out.println("The result is\n"+rev);
	}

}
class doo
{
	public static void main(String[] args) 
	{
	  good g=new good();
	  g.input();
	}

}
