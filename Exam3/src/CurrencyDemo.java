import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*uble money=new Double(1000.00);
		Locale currentLocale=new Locale("de","DE");
		NumberFormat currency=NumberFormat.getCurrencyInstance(currentLocale);
		System.out.println(currency.format(money));*/
		
		
		try
		{
			int a=0;
			int b=15/a;
			
		}
		catch(Throwable e)
		{
			System.out.println("Exception");
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("");
			
			
		}
		
	}

}
