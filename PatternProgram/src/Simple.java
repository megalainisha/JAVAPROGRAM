import java.util.Scanner;

public class Simple {

	public static void main(String[] args) 
	{
	     int n,i,j;
	     Scanner s=new Scanner(System.in);
	     n=s.nextInt();
	     
	     for(i=1;i<=n;i++)
	     {
	    	for(j=1;j<i;j++) 
	    	{
	    		System.out.print(" ");
	    	}
	    		for(j=n;j>=i;j--)
	    		{
	    			System.out.print(j+" ");
	    		}
	    	System.out.println();
	     }
	 
	     for(i=n-1;i>=1;i--)
	     {
	    	 for(j=1;j<i;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(j=n;j>=i;j--)
	    	 {
	    		 System.out.print(j+" ");
	    	 }
	    	 System.out.println();
	     }
	  
	     

	}

}
