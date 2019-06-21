import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo extends Thread
{
	AtomicInteger value;
	public void run()
	{
		value=new AtomicInteger(5);
		value.getAndIncrement();
		value.set(40);
		value.getAndDecrement();
		value.compareAndSet(39, 45);
		System.out.println(value.getAndDecrement());
		System.out.println(value.get());
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td=new ThreadDemo();
		td.start();

	}

}
