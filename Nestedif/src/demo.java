import java.util.Scanner;

public class demo
{
	Scanner s=new Scanner(System.in);
    int age,sal,d;
    void get()
    {
    	System.out.println("Enter the age and salary\n");
    	age=s.nextInt();
    	sal=s.nextInt();
    	if(age>=60)
    	{
    		if(sal>=20000)
    		{
    		   d=sal+500;
    		   System.out.println("The insentive is "+d);
    		}
    		else
    		{
    			d=sal+1000;
    			System.out.println("The insentive is "+d);
    		}
    	}
    	else
    	{
    		d=sal;
    		System.out.println("The insentive is "+d);
    	}
    }
	
}
class demo1
{
	public static void main(String[] args) 
	{
		demo d=new demo();
		d.get();
	}

}
