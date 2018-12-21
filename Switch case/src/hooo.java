import java.util.Scanner;

public class hooo
{
  int a,b,c,m;
  Scanner d=new Scanner(System.in);
  void out()
  {
	  System.out.println("Enter the a and b values\n");
	  a=d.nextInt();
	  b=d.nextInt();
	  System.out.println("Option\n 1.add \n 2.sub \n 3.mul \n 4.div");
	  m=d.nextInt();
	  switch(m)
	  {
		  case 1:
			  c=a+b;
			  System.out.println("The result is "+c);
			  break;
		  case 2:
			  c=a-b;
			  System.out.println("The result is "+c);
			  break;
		  case 3:
			  c=a*b;
			  System.out.println("The result is "+c);
			  break;
		  case 4:
			  c=a/b;
			  System.out.println("The result is "+c);
			  break;
	      default:
		      System.out.println("Default case"); 
	  }
  }
}
class demo
{
	public static void main(String[] args) 
	{
	   hooo h=new hooo();
	   h.out();
   
	}

}
