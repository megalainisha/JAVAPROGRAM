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

public class LOGIN extends JFrame {

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
					LOGIN frame = new LOGIN();
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
	
	public LOGIN() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoginForm.setBounds(169, 29, 126, 16);
		contentPane.add(lblLoginForm);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserId.setBounds(62, 84, 56, 16);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(62, 129, 78, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(195, 84, 100, -44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 81, 175, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 126, 175, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//final JButton btnNewButton =new JButton("Login");
		JButton btnNewButton1 = new JButton("LOGIN\r\n");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
				String e=textField_1.getText();
				String p=textField_2.getText();
			
				String str="select * from loginpage where EMAIL='"+e+"' AND PASS='"+p+"'";
				 
				Class.forName("org.h2.Driver");
				Connection c=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery(str);
				rs.next();
				String email=rs.getString(1);
				String pass=rs.getString(2);
				
				//System.out.println(rs.getString(1)+""+rs.getString(2));
				
				
				
				if(e.equals(email)&&p.equals(pass))
				{
					JOptionPane.showMessageDialog(btnNewButton1,"login success...");
					new Admin().setVisible(true);
					close();
				}
				/*if(arg0.getSource()==btnNewButton1)
				{
					new Admin().setVisible(true);
					close();
				}*/
				}
				catch(Exception r)
				{
					System.out.println("login fail");
				}
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton1.setBounds(85, 191, 97, 25);
		contentPane.add(btnNewButton1);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(234, 191, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}
