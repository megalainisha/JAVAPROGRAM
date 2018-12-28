
public class sample
{
	//int k,l;
	int k1,k2;
	void get(int k,int l)
	{
		this.k=k1;
		this.l=k2;
		System.out.println("Get1 values is"+k+" "+l);
	}
	void get2()
	{
		System.out.println("Get2 value is"+k1+" "+k2);
	}
}
class demo
{
	public static void main(String[] args)
	{
           sample s=new sample();
           s.get(100,200);
           s.get2();
	}

}
