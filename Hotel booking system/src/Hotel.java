import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.CompoundBorder;
import java.awt.Color;

public class Hotel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel frame = new Hotel();
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
	
	public Hotel() {
		setBounds(100, 100, 865, 579);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomepage = new JLabel("RADDISSON BLU");
		lblHomepage.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblHomepage.setBounds(248, 34, 313, 43);
		contentPane.add(lblHomepage);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnLogin)
				{
					new Login().setVisible(true);
					close();
				}
			}
		});
		btnLogin.setBounds(199, 181, 143, 43);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER CUSTOMER DETAILS");
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) 
			{
				if(e1.getSource()==btnRegister)
				{
					new RegisterCustomerDetails().setVisible(true);
					close();
				}
			}
		});
		btnRegister.setBounds(219, 278, 373, 65);
		contentPane.add(btnRegister);
		
		JButton btnEdit = new JButton("REGISTER STAFF DETAILS");
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(arg0.getSource()==btnEdit)
				{
					new RegisterStaffDetails().setVisible(true);
					close();
				}
			}
		});
		btnEdit.setBounds(225, 410, 373, 58);
		contentPane.add(btnEdit);
		
		JButton btnAdmin = new JButton("ADMIN PAGE");
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(btnAdmin, "Login to open the page");
				close();
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdmin.setBounds(448, 181, 165, 43);
		contentPane.add(btnAdmin);
		
		JLabel lblLiveInThe = new JLabel("LIVE IN THE HEAVEN......");
		lblLiveInThe.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblLiveInThe.setBounds(556, 68, 214, 36);
		contentPane.add(lblLiveInThe);
	}
}
