import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	public Login() {
		setBounds(100, 100, 931, 581);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setForeground(Color.MAGENTA);
		lblLoginForm.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblLoginForm.setBounds(320, 61, 289, 29);
		contentPane.add(lblLoginForm);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBackground(Color.MAGENTA);
		lblUserId.setFont(new Font("Castellar", Font.BOLD, 24));
		lblUserId.setBounds(154, 171, 167, 30);
		contentPane.add(lblUserId);
		
		
		textField = new JTextField();
		textField.setBounds(195, 84, 100, -44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField_1.setBounds(447, 161, 363, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_2.setBounds(447, 254, 363, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//final JButton btnNewButton =new JButton("Login");
		JButton btnNewButton1 = new JButton("LOGIN");
		btnNewButton1.setForeground(Color.RED);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
				String e=textField_1.getText();
				String p=textField_2.getText();
			
				String str="select * from staffreg where EMAIL='"+e+"' AND PASSWORD='"+p+"' AND DESIGNATION='STAFF' ";
				 
				Class.forName("org.h2.Driver");
				Connection c=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery(str);
				rs.next();
				String email=rs.getString(6);
				String password=rs.getString(10);
				
		        //System.out.println(rs.getString(6)+""+rs.getString(10));
				
				
				
				if(e.equals(email)&&p.equals(password))
				{
					JOptionPane.showMessageDialog(btnNewButton1,"login success...");
					new PageAdmin().setVisible(true);
					close();
				}
				/*if(arg0.getSource()==btnNewButton1)
				{
					new UpdateCustomerDetails().setVisible(true);
					close();
				}*/
				}
				catch(Exception r)
				{
					System.out.println("login fail");
				}
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton1.setBounds(198, 364, 140, 40);
		contentPane.add(btnNewButton1);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setBounds(551, 364, 127, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(arg0.getSource()==btnBack)
				{
					new Hotel().setVisible(true);
					close();
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setForeground(Color.RED);
		btnBack.setBounds(717, 461, 115, 29);
		contentPane.add(btnBack);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Castellar", Font.BOLD, 24));
		lblPassword.setBounds(154, 261, 158, 29);
		contentPane.add(lblPassword);
	}
}
