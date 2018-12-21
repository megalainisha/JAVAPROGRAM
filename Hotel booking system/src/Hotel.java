import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public Hotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomepage = new JLabel("HOMEPAGE");
		lblHomepage.setBounds(136, 38, 86, 16);
		contentPane.add(lblHomepage);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnLogin)
				{
					new LOGIN().setVisible(true);
					
				}
			}
		});
		btnLogin.setBounds(12, 94, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) 
			{
				if(e1.getSource()==btnRegister)
				{
					new Register().setVisible(true);
				}
			}
		});
		btnRegister.setBounds(146, 94, 97, 25);
		contentPane.add(btnRegister);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setBounds(279, 94, 97, 25);
		contentPane.add(btnEdit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(74, 153, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setBounds(214, 153, 97, 25);
		contentPane.add(btnAdmin);
	}
}
