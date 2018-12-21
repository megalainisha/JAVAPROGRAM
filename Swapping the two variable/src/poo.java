import java.util.Scanner;

public class poo
{
	int a,b;
	Scanner s=new Scanner(System.in);
	
	void display()
	{
		System.out.println("Enter the two values a and b");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before Swapping\n"+a+"\n"+b);
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping\n"+a+"\n"+b);
	}

}
class doo
{
	public static void main(String[] args)
	{
		poo p=new poo();
		p.display();

	}

}
