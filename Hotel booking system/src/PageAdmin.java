import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PageAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageAdmin frame = new PageAdmin();
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
	public PageAdmin() {
		setBounds(100, 100, 888, 661);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatabase = new JLabel("ADMIN DATABASE");
		lblDatabase.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblDatabase.setBounds(209, 34, 454, 61);
		contentPane.add(lblDatabase);
		
		JButton btnEmployeeDetails = new JButton("ADD EMPLOYEE DETAILS");
		btnEmployeeDetails.setBackground(Color.WHITE);
		btnEmployeeDetails.setForeground(Color.BLACK);
		btnEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnEmployeeDetails)
				{
					new UpdateCustomerDetails().setVisible(true);
					close();
				}
			}
		});
		btnEmployeeDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnEmployeeDetails.setBounds(40, 149, 386, 51);
		contentPane.add(btnEmployeeDetails);
		
		JButton btnCustomerDetails = new JButton("ADD CUSTOMER DETAILS");
		btnCustomerDetails.setForeground(Color.BLACK);
		btnCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCustomerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnCustomerDetails)
				{
				   new UpdateCustomerDetails().setVisible(true);
				   close();
				}
			}
		});
		btnCustomerDetails.setBounds(391, 228, 427, 51);
		contentPane.add(btnCustomerDetails);
		
		JButton btnViewDetails = new JButton("VIEW STAFF DETAILS");
		btnViewDetails.setForeground(Color.BLACK);
		btnViewDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnViewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnViewDetails)
				{
					new ViewStaffDetails().setVisible(true);
					close();
				}
			}
		});
		btnViewDetails.setBounds(30, 329, 427, 51);
		contentPane.add(btnViewDetails);
		
		JButton btnViewCustomerDetails = new JButton("VIEW CUSTOMER DETAILS");
		btnViewCustomerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(arg0.getSource()==btnViewCustomerDetails)
				{
					new ViewCustomerDetails().setVisible(true);
					close();
					
				}
			}
		});
		btnViewCustomerDetails.setForeground(Color.BLACK);
		btnViewCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnViewCustomerDetails.setBounds(372, 437, 427, 51);
		contentPane.add(btnViewCustomerDetails);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 22));
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
		btnBack.setBounds(331, 528, 115, 29);
		contentPane.add(btnBack);
	}
}
