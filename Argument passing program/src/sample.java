
public class sample
{
   String uname="Details";  //class or instance variable
   void get(String name,int age)
   {
	   double d=3.4; //local variable
	   System.out.println("welcome\n"+uname+"\n"+name+"\n"+age);
	   System.out.println("The double value is"+d);
   }
   
   void out(int sal,float day)
   {
	   System.out.println("The details\n"+sal+"\n"+day);
   }
}
class foo
{
	public static void main(String[] args)
	{
	 sample s=new sample();
	 s.get("Ramya", 23);
	 s.out(35000,28);

	}

}
