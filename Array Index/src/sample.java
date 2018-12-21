import java.util.Scanner;

public class sample
{
	int i,n,k;
    int	p[]=new int[20];
    Scanner s=new Scanner(System.in);
    
    void input()
    {
    	System.out.println("Enter the n value");
    	n=s.nextInt();
    	
    	for(i=0;i<=n;i++)
    	{
    		System.out.println("Enter the array values");
    		p[i]=s.nextInt();
    	}
    }
    
    void output()
    {
    	System.out.println("Enter the index values");
    	k=s.nextInt();
    	
    	for(i=0;i<=n;i++)
    	{
    		if(i==k)
    		{
    			System.out.println("The array index value is"+p[i]);
    		}
    		/*else
    		{
    			System.out.println("Not Found");
    		}*/
    	}
    }

}
class foo
{
	public static void main(String[] args) 
	{
		sample m=new sample();
		m.input();
		m.output();
	}

}
