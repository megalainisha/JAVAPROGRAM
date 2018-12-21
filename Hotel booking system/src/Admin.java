import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("ADMIN PAGE");
		lblAdminPage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdminPage.setBounds(151, 24, 96, 16);
		contentPane.add(lblAdminPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserId.setBounds(40, 72, 56, 16);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setBounds(131, 70, 178, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNext.setBounds(274, 121, 97, 25);
		contentPane.add(btnNext);
	}
}
