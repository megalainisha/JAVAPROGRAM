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
import java.awt.Color;
import javax.swing.UIManager;

public class UpdateCustomerDetails extends JFrame {

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
					UpdateCustomerDetails frame = new UpdateCustomerDetails();
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
	

	public UpdateCustomerDetails() {
		setBounds(100, 100, 1018, 1255);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("UPDATE CUSTOMER DETAILS\r\n");
		lblAdminPage.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblAdminPage.setBounds(281, 59, 430, 36);
		contentPane.add(lblAdminPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblUserId.setBounds(179, 171, 97, 25);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(504, 169, 352, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblName.setBounds(179, 250, 69, 20);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(504, 246, 352, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblDob.setBounds(179, 330, 69, 20);
		contentPane.add(lblDob);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setBounds(504, 322, 352, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblGender.setBounds(179, 405, 97, 20);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(504, 392, 352, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblCity.setBounds(179, 474, 69, 20);
		contentPane.add(lblCity);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setBounds(498, 468, 358, 36);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPay = new JLabel("PAY1");
		lblPay.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblPay.setBounds(179, 625, 69, 20);
		contentPane.add(lblPay);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setBounds(498, 617, 358, 36);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPay_1 = new JLabel("PAY2");
		lblPay_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblPay_1.setBounds(179, 698, 69, 20);
		contentPane.add(lblPay_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setBounds(498, 686, 358, 36);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPay_2 = new JLabel("PAY3");
		lblPay_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblPay_2.setBounds(179, 769, 69, 20);
		contentPane.add(lblPay_2);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setBounds(498, 762, 358, 36);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblRoom.setBounds(179, 546, 69, 20);
		contentPane.add(lblRoom);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setBounds(498, 539, 358, 36);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblRoomId = new JLabel("ROOM ID");
		lblRoomId.setFont(new Font("Imprint MT Shadow", Font.BOLD, 18));
		lblRoomId.setBounds(179, 851, 97, 20);
		contentPane.add(lblRoomId);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setBounds(498, 844, 358, 36);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		
		
		JButton btnNext = new JButton("VIEW");
		btnNext.setBackground(UIManager.getColor("FormattedTextField.caretForeground"));
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
		btnNext.setFont(new Font("Poor Richard", Font.BOLD, 20));
		btnNext.setBounds(179, 974, 97, 25);
		contentPane.add(btnNext);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(UIManager.getColor("CheckBox.foreground"));
		btnUpdate.setFont(new Font("Poor Richard", Font.BOLD, 20));
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
		btnUpdate.setBounds(396, 972, 155, 29);
		contentPane.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(UIManager.getColor("Button.foreground"));
		btnBack.setFont(new Font("Poor Richard", Font.BOLD, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			   if(arg0.getSource()==btnBack)	
			   {
				   new Login().setVisible(true);
				   close();
			   }
			}
		});
		btnBack.setBounds(650, 972, 115, 29);
		contentPane.add(btnBack);
	}
}
