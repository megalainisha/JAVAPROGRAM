
public class Demo 
{
      /*void DemoMethod() {
    	  System.out.println("NO paramerters");
      }
      
      void DemoMethod(double a,double b)
      {
    	  System.out.println("This is the double method");
      }
      void DemoMethod(int a,int b)
      {
    	  System.out.println("This is the integer method");
      }*/
	
	
	private String x="MyOuterClass";
	void display()
	{
		String z="local variable";
		System.out.println(x);
		
		class Inner
		{
			public void print()
			{
				System.out.println("outer x"+x);
				System.out.println("local variable z"+z);
			}
		}
		Inner obj=new Inner();
		obj.print();
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Demo ob=new Demo();
         /* ob.DemoMethod();
          ob.DemoMethod(20, 10);
          ob.DemoMethod(123.2, 1.99);*/
          ob.display();
	}

}
