import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewStaffDetails extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStaffDetails frame = new ViewStaffDetails();
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
	public ViewStaffDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 805);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewStaffDetails = new JLabel("VIEW STAFF DETAILS");
		lblViewStaffDetails.setForeground(new Color(250, 240, 230));
		lblViewStaffDetails.setFont(new Font("Snap ITC", Font.BOLD, 40));
		lblViewStaffDetails.setBounds(192, 16, 591, 67);
		contentPane.add(lblViewStaffDetails);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(15, 175, 952, 558);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(15, 16, 922, 526);
		panel.add(scrollPane);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Cooper Black", Font.BOLD, 25));
		lblId.setBackground(new Color(245, 245, 220));
		lblId.setBounds(105, 103, 69, 20);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(262, 99, 273, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				  try
				    {
					String u=textField.getText();
					
					String str="select * from staffreg where empid='"+u+"'" ;
		
					Class.forName("org.h2.Driver");
				     Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					}
					catch(Exception r)
					{
						System.out.println(r);
					}

			}
		});
		btnNext.setFont(new Font("Gunplay", Font.BOLD, 20));
		btnNext.setBounds(655, 102, 115, 29);
		contentPane.add(btnNext);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
