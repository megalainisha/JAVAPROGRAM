import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
	public LOGIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setBounds(169, 29, 85, 16);
		contentPane.add(lblLoginForm);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(62, 84, 56, 16);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
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
		
		JButton btnNewButton = new JButton("LOGIN\r\n");
		btnNewButton.setBounds(85, 191, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBounds(234, 191, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}
