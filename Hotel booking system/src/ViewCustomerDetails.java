import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class ViewCustomerDetails extends JFrame {

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
					ViewCustomerDetails frame = new ViewCustomerDetails();
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
	public ViewCustomerDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 779);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditPage = new JLabel("VIEW CUSTOMER DETAILS");
		lblEditPage.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 32));
		lblEditPage.setBounds(246, 27, 401, 43);
		contentPane.add(lblEditPage);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Stencil", Font.BOLD, 25));
		lblUserId.setBackground(Color.ORANGE);
		lblUserId.setBounds(149, 106, 104, 25);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(347, 94, 216, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				   try
				    {
					 String u=textField.getText();
					
					  String str="select * from reg where userid='"+u+"'" ;
		  
					  // String str="select * from reg"; 
					   
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
		btnNext.setBounds(679, 99, 115, 29);
		contentPane.add(btnNext);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(15, 208, 848, 499);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane.setBounds(10, 11, 823, 465);
				panel.add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
		
	}
}
