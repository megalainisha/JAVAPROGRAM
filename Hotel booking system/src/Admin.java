import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	 public void close()
	   {
		    
		    WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		        
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
		    
		}
	

	public Admin() {
		setBounds(100, 100, 971, 918);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("ADMIN PAGE");
		lblAdminPage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdminPage.setBounds(420, 16, 96, 16);
		contentPane.add(lblAdminPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserId.setBounds(198, 78, 78, 25);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setBounds(504, 72, 189, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(198, 132, 69, 20);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(504, 128, 189, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(198, 201, 69, 20);
		contentPane.add(lblDob);
		
		textField_2 = new JTextField();
		textField_2.setBounds(504, 198, 189, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(198, 263, 69, 20);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setBounds(504, 260, 189, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setBounds(198, 331, 69, 20);
		contentPane.add(lblCity);
		
		textField_4 = new JTextField();
		textField_4.setBounds(504, 325, 189, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPay = new JLabel("PAY1");
		lblPay.setBounds(198, 473, 69, 20);
		contentPane.add(lblPay);
		
		textField_5 = new JTextField();
		textField_5.setBounds(502, 467, 191, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPay_1 = new JLabel("PAY2");
		lblPay_1.setBounds(198, 551, 69, 20);
		contentPane.add(lblPay_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(504, 545, 189, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPay_2 = new JLabel("PAY3");
		lblPay_2.setBounds(198, 637, 69, 20);
		contentPane.add(lblPay_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(504, 631, 189, 26);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setBounds(198, 401, 69, 20);
		contentPane.add(lblRoom);
		
		textField_8 = new JTextField();
		textField_8.setBounds(504, 395, 189, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblRoomId = new JLabel("ROOM ID");
		lblRoomId.setBounds(198, 713, 69, 20);
		contentPane.add(lblRoomId);
		
		textField_9 = new JTextField();
		textField_9.setBounds(504, 710, 189, 26);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		
		
		JButton btnNext = new JButton("VIEW");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String u=textField.getText();
					String s="select name,dob,gen,city,room,pay1,pay2,pay3,roomid from reg where userid='"+u+"'";
					Class.forName("org.h2.Driver");
                    Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(s);
                    rs.next();
                    String na=rs.getString("name");
                    String d=rs.getString("dob");
                    String g=rs.getString("gen");
                    String c=rs.getString("city");
                    String r=rs.getString("room");
                    String p1=rs.getString("pay1");
                    String p2=rs.getString("pay2");
                    String p3=rs.getString("pay3");
                    String rm=rs.getString("roomid");
                    
                    textField_1.setText(na);
                    textField_2.setText(d);
                    textField_3.setText(g);
                    textField_4.setText(c);
                    textField_8.setText(r);
                    textField_5.setText(p1);
                    textField_6.setText(p2);
                    textField_7.setText(p3);
                    textField_9.setText(rm);
                    
                    JOptionPane.showMessageDialog(btnNext,"Searching");
                }
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNext.setBounds(179, 821, 97, 25);
		contentPane.add(btnNext);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String ct=textField_4.getText();
					String ro=textField_8.getText();
					String p1=textField_5.getText();
					String p2=textField_6.getText();
					String p3=textField_7.getText();
					String ri=textField_9.getText();
					
					String str="update reg set city='"+ct+"',room='"+ro+"',pay1='"+p1+"',pay2='"+p2+"',pay3='"+p3+"',roomid='"+ri+"'";
					 Class.forName("org.h2.Driver");
	                    Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
	                    Statement st=con.createStatement();
	                    st.executeUpdate(str);
	                    JOptionPane.showMessageDialog(btnUpdate, "updated......");

				}
				catch(Exception r)
				{
				   System.out.println(r);	
				}
			}
		});
		btnUpdate.setBounds(412, 819, 115, 29);
		contentPane.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			   if(arg0.getSource()==btnBack)	
			   {
				   new LOGIN().setVisible(true);
				   close();
			   }
			}
		});
		btnBack.setBounds(672, 819, 115, 29);
		contentPane.add(btnBack);
	}
}
