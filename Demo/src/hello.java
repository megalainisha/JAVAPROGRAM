import java.awt.Button;
import java.awt.FlowLayout;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hello<T> 
{

	/*private T T;
	public void setValue(T t)
	{
		t=t;
		System.out.println(T);
	}*/
	
	public static void main(String[] args) 
	{
		/*hello<Integer> gd1=new hello<>();
		gd1.setValue(12);*/
		
		// TODO Auto-generated method stub
		/*String str1=new String("TECHNOLOGY");
		String str2=new String("TECHNOLOGY");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));*/
		
		
		Pattern p=Pattern.compile("sam++");
		Matcher m=p.matcher("sam");
		boolean b=m.matches();
		System.out.println(b);
		
		/*TreeMap<Integer,String> tMap=new TreeMap<>();
		tMap.put(1, "NORTH");
		tMap.put(3, "EAST");
		tMap.put(2, "SOUTH");
		tMap.put(3, "WEST");
		System.out.println(tMap.get(2));
		System.out.println(tMap);*/
		
		/*JFrame f=new JFrame("Color Changer");
		f.setLayout(new FlowLayout());
		f.add(new JLabel("Enter your name"));
		f.add(new JTextField(20));
		f.add(new Button("Red"));
		f.add(new Button("Blue"));
		f.add(new Button("Green"));
		f.pack();
		f.setVisible(true);*/
		
		
		
	}

}
