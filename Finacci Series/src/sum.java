import java.util.Scanner;

public class sum
{
	int n,f=0,s=1,k,c;
	
	Scanner g=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the number");
		n=g.nextInt();
		System.out.println("The Finacci Series");
		for(c=0;c<n;c++)
		{
			if(c<=1)
			{
				k=c;
			}
			else
			{
				k=f+s;
				f=s;
				s=k;
			}
			
			System.out.println(k);
		}
	}
}
class demo
{
	public static void main(String[] args)
	{
	  sum h=new sum();
	  h.input();

	}

}
