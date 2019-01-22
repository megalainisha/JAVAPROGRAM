import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterStaffDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterStaffDetails frame = new RegisterStaffDetails();
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
	
	public RegisterStaffDetails() {
		setBounds(100, 100, 986, 1106);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStaffDetails = new JLabel("STAFF DETAILS");
		lblStaffDetails.setForeground(Color.RED);
		lblStaffDetails.setFont(new Font("Goudy Stout", Font.BOLD, 35));
		lblStaffDetails.setBounds(181, 34, 559, 37);
		contentPane.add(lblStaffDetails);
		
		JLabel lblEmployeeDetails = new JLabel("ID");
		lblEmployeeDetails.setForeground(Color.MAGENTA);
		lblEmployeeDetails.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblEmployeeDetails.setBounds(78, 128, 197, 37);
		contentPane.add(lblEmployeeDetails);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(382, 128, 251, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(255, 0, 255));
		lblName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblName.setBounds(78, 209, 113, 20);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(382, 201, 251, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH");
		lblDateOfBirth.setForeground(Color.MAGENTA);
		lblDateOfBirth.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblDateOfBirth.setBounds(78, 281, 178, 20);
		contentPane.add(lblDateOfBirth);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBounds(382, 273, 251, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBackground(Color.CYAN);
		lblGender.setForeground(Color.MAGENTA);
		lblGender.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblGender.setBounds(78, 361, 129, 20);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMale.setBounds(382, 357, 92, 29);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFemale.setBounds(522, 357, 113, 29);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblQualification = new JLabel("QUALIFICATION");
		lblQualification.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblQualification.setForeground(Color.MAGENTA);
		lblQualification.setBackground(new Color(240, 240, 240));
		lblQualification.setBounds(78, 425, 197, 20);
		contentPane.add(lblQualification);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MBA", "HOTEL MANAGEMENT", "BBA", "ACCOUTANT", "B.SC", "BCA"}));
		comboBox.setBounds(382, 424, 251, 26);
		contentPane.add(comboBox);
		
		JLabel lblAddress = new JLabel("EMAIL ADDRESS");
		lblAddress.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblAddress.setForeground(Color.MAGENTA);
		lblAddress.setBounds(78, 503, 197, 20);
		contentPane.add(lblAddress);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBounds(382, 497, 329, 37);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmailId = new JLabel("MOBILE NO");
		lblEmailId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblEmailId.setForeground(Color.MAGENTA);
		lblEmailId.setBounds(72, 588, 168, 20);
		contentPane.add(lblEmailId);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setBounds(382, 582, 251, 37);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDesignation = new JLabel("DESIGNATION");
		lblDesignation.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblDesignation.setForeground(Color.MAGENTA);
		lblDesignation.setBounds(78, 669, 162, 20);
		contentPane.add(lblDesignation);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"EMPLOYEE", "STAFF", "MANAGER", "", ""}));
		comboBox_1.setBounds(382, 666, 251, 26);
		contentPane.add(comboBox_1);
		
		JLabel lblBankDetails = new JLabel("BANK DETAILS");
		lblBankDetails.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblBankDetails.setForeground(Color.MAGENTA);
		lblBankDetails.setBounds(78, 766, 178, 20);
		contentPane.add(lblBankDetails);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		textField_5.setBounds(382, 752, 251, 37);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMatritalStatus = new JLabel("PASSWORD");
		lblMatritalStatus.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblMatritalStatus.setForeground(Color.MAGENTA);
		lblMatritalStatus.setBounds(78, 858, 129, 20);
		contentPane.add(lblMatritalStatus);
		
		JLabel lblAddress_1 = new JLabel("ADDRESS ");
		lblAddress_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblAddress_1.setForeground(Color.MAGENTA);
		lblAddress_1.setBounds(78, 946, 162, 20);
		contentPane.add(lblAddress_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setBounds(382, 940, 284, 37);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 21));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
				 String empid=textField.getText();
				 String name=textField_1.getText();
				 String dob=textField_2.getText();
				 String gen="";
				 String quali=(String) comboBox.getSelectedItem();
				 String email=textField_3.getText();
				 String mob=textField_4.getText();
				 String deg=(String) comboBox_1.getSelectedItem();
				 String bank=textField_5.getText();
				 String pass=textField_7.getText();
				 String add=textField_6.getText();
				 
				 if(rdbtnMale.isSelected())
				 {
					 gen="MALE";
				 }
				 else
				 {
					 gen="FEMALE";
				 }
				 
				 String str="insert into staffreg values('"+empid+"','"+name+"','"+dob+"','"+gen+"','"+quali+"','"+email+"','"+mob+"','"+deg+"','"+bank+"','"+pass+"','"+add+"')";
				 Class.forName("org.h2.Driver");
				 Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","");
				 Statement st=con.createStatement();
				 st.executeUpdate(str);
				 JOptionPane.showMessageDialog(btnSubmit, "Inserted......");
				 
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnSubmit.setBounds(754, 943, 139, 29);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
    		}
		});
		btnCancel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		btnCancel.setBounds(741, 1005, 168, 29);
		contentPane.add(btnCancel);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setBounds(382, 850, 251, 37);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
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
		btnBack.setBounds(331, 1005, 115, 29);
		contentPane.add(btnBack);
	}
}
