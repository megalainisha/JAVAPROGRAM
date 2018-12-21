import java.util.Scanner;

public class cal 
{
  int s,rem,sum;
  Scanner d=new Scanner(System.in);
  
  void get()
  {
	 System.out.println("Enter the number");
	 s=d.nextInt();
	 
	 while(s!=0)
	 {
		 rem=s%10;
		 sum=sum+rem;
		 s=s/10;
	 }
	 System.out.println("The sum of the digit is "+sum);
  }
}
class doo
{
	public static void main(String[] args) 
	{
		cal c=new cal();
		c.get();

	}

}
