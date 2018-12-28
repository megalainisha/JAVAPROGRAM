import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Edit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
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
	public Edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 779);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditPage = new JLabel("VIEW DETAILS");
		lblEditPage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEditPage.setBounds(363, 33, 121, 20);
		contentPane.add(lblEditPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(167, 108, 69, 20);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setBounds(347, 105, 205, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(679, 99, 115, 29);
		contentPane.add(btnNext);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 186, 811, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
	}
}
