import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UpdateStaffDetails extends JFrame {

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
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaffDetails frame = new UpdateStaffDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void close()
	   {
		    
		    WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		        
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
		    
		}
	
	/**
	 * Create the frame.
	 */
	public UpdateStaffDetails() {
		setBounds(100, 100, 918, 1237);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdateTheStaff = new JLabel("UPDATE STAFF DETAILS");
		lblUpdateTheStaff.setBackground(Color.PINK);
		lblUpdateTheStaff.setForeground(Color.RED);
		lblUpdateTheStaff.setFont(new Font("High Tower Text", Font.BOLD | Font.ITALIC, 35));
		lblUpdateTheStaff.setBounds(217, 16, 537, 71);
		contentPane.add(lblUpdateTheStaff);
		
		JLabel lblId = new JLabel(" ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblId.setBounds(115, 146, 69, 20);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(409, 132, 316, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(115, 233, 69, 20);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(409, 218, 316, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(115, 323, 69, 20);
		contentPane.add(lblDob);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBounds(409, 308, 316, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(115, 409, 100, 20);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBounds(409, 392, 316, 34);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblQualification = new JLabel("QUALIFICATION");
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQualification.setBounds(115, 488, 163, 20);
		contentPane.add(lblQualification);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setBounds(409, 472, 316, 34);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(115, 564, 69, 20);
		contentPane.add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setBounds(409, 550, 316, 34);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(115, 655, 134, 20);
		contentPane.add(lblMobileNo);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setBounds(409, 635, 316, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDesignation = new JLabel("DESIGNATION");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDesignation.setBounds(115, 734, 163, 20);
		contentPane.add(lblDesignation);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setBounds(409, 713, 316, 34);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblBankDetails = new JLabel("BANK DETAILS");
		lblBankDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBankDetails.setBounds(115, 805, 152, 20);
		contentPane.add(lblBankDetails);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_8.setBounds(409, 791, 316, 34);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(115, 881, 134, 20);
		contentPane.add(lblPassword);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_9.setBounds(409, 875, 316, 34);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(115, 953, 123, 20);
		contentPane.add(lblAddress);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_10.setBounds(409, 943, 316, 34);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnView = new JButton("VIEW");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
				String u=textField.getText();
				String str="select name,dob,gender,qualification,email,mobileno,designation,bankdetails,password,address from staffreg where empid='"+u+"'";
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(str);
				rs.next();
				
				String na=rs.getString("name");
				String db=rs.getString("dob");
				String ge=rs.getString("gender");
				String qu=rs.getString("qualification");
				String em=rs.getString("email");
				String mo=rs.getString("mobileno");
				String de=rs.getString("designation");
				String ba=rs.getString("bankdetails");
				String pa=rs.getString("password");
				String ad=rs.getString("address");
				
				textField_1.setText(na);
				textField_2.setText(db);
				textField_3.setText(ge);
				textField_4.setText(qu);
				textField_5.setText(em);
				textField_6.setText(mo);
				textField_7.setText(de);
				textField_8.setText(ba);
				textField_9.setText(pa);
				textField_10.setText(ad);
				
				JOptionPane.showMessageDialog(btnView, "Searching..........");
				
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
				
			}
		});
		btnView.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnView.setBounds(219, 1005, 115, 29);
		contentPane.add(btnView);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
				String u=textField.getText();
				String na=textField_1.getText();
				String dob=textField_2.getText();
				String qu=textField_4.getText();
				String em=textField_5.getText();
				String mo=textField_6.getText();
				String de=textField_7.getText();
				String ba=textField_8.getText();
				String pa=textField_9.getText();
				String ad=textField_10.getText();
				
				String str="update staffreg set name='"+na+"',dob='"+dob+"',qualification='"+qu+"',email='"+em+"',mobileno='"+mo+"',designation='"+de+"',bankdetails='"+ba+"',password='"+pa+"',address='"+ad+"'";
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				Statement st=con.createStatement();
				st.executeUpdate(str);
				JOptionPane.showMessageDialog(btnUpdate,"Updated......");
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnUpdate.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnUpdate.setBounds(419, 1006, 115, 29);
		contentPane.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(arg0.getSource()==btnBack)
				{
					new PageAdmin().setVisible(true);
					close();
					
				}
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBounds(632, 1007, 115, 29);
		contentPane.add(btnBack);
	}
}
