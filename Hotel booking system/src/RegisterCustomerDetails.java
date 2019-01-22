import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

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
import javax.swing.JCheckBox;
import java.awt.Color;

public class RegisterCustomerDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterCustomerDetails frame = new RegisterCustomerDetails();
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
	
	public RegisterCustomerDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 916);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterForm = new JLabel("REGISTER FORM");
		lblRegisterForm.setFont(new Font("Stencil", Font.BOLD, 30));
		lblRegisterForm.setBounds(319, 26, 298, 31);
		contentPane.add(lblRegisterForm);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Elephant", Font.BOLD, 20));
		lblUserId.setBounds(168, 102, 144, 23);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(433, 94, 233, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Elephant", Font.BOLD, 20));
		lblName.setBounds(168, 164, 85, 22);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(433, 155, 233, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Elephant", Font.BOLD, 20));
		lblDob.setBounds(168, 239, 85, 25);
		contentPane.add(lblDob);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBounds(433, 233, 275, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Elephant", Font.BOLD, 20));
		lblGender.setBounds(168, 321, 139, 22);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setFont(new Font("Elephant", Font.BOLD, 20));
		rdbtnMale.setBounds(433, 320, 137, 25);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setFont(new Font("Elephant", Font.BOLD, 20));
		rdbtnFemale.setBounds(644, 320, 173, 25);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setFont(new Font("Elephant", Font.BOLD, 20));
		lblCity.setBounds(168, 400, 97, 19);
		contentPane.add(lblCity);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Elephant", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DINDIGUL", "KARUR", "MADURAI", "CHENNAI", "TRICHY", "COIMBATORE"}));
		comboBox.setBounds(433, 394, 224, 31);
		contentPane.add(comboBox);
		
		JLabel lblRoom = new JLabel("ROOM");
		lblRoom.setFont(new Font("Elephant", Font.BOLD, 20));
		lblRoom.setBounds(168, 480, 105, 19);
		contentPane.add(lblRoom);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setFont(new Font("Elephant", Font.BOLD, 20));
		rdbtnAc.setBounds(433, 476, 106, 25);
		contentPane.add(rdbtnAc);
		
		JRadioButton rdbtnNonac = new JRadioButton("NON-AC");
		rdbtnNonac.setFont(new Font("Elephant", Font.BOLD, 20));
		rdbtnNonac.setBounds(653, 476, 149, 25);
		contentPane.add(rdbtnNonac);
		
		ButtonGroup bh=new ButtonGroup();
		bh.add(rdbtnAc);
		bh.add(rdbtnNonac);
		
		JLabel lblPayment = new JLabel("PAYMENT");
		lblPayment.setFont(new Font("Elephant", Font.BOLD, 20));
		lblPayment.setBounds(168, 561, 144, 23);
		contentPane.add(lblPayment);
		
		JLabel lblRoomId = new JLabel("ROOM ID");
		lblRoomId.setFont(new Font("Elephant", Font.BOLD, 20));
		lblRoomId.setBounds(168, 650, 124, 31);
		contentPane.add(lblRoomId);
		
		JCheckBox chckbxDc = new JCheckBox("DC");
		chckbxDc.setFont(new Font("Elephant", Font.BOLD, 20));
		chckbxDc.setBounds(433, 559, 85, 25);
		contentPane.add(chckbxDc);
		
		JCheckBox chckbxCc = new JCheckBox("CC");
		chckbxCc.setFont(new Font("Elephant", Font.BOLD, 20));
		chckbxCc.setBounds(570, 559, 76, 25);
		contentPane.add(chckbxCc);
		
		JCheckBox chckbxCash = new JCheckBox("CASH");
		chckbxCash.setFont(new Font("Elephant", Font.BOLD, 20));
		chckbxCash.setBounds(713, 560, 117, 25);
		contentPane.add(chckbxCash);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBounds(432, 643, 330, 38);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setForeground(new Color(199, 21, 133));
		btnConfirm.setBackground(new Color(128, 128, 0));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String  userid=textField.getText();
					String name=textField_1.getText();
					String dob=textField_2.getText();
					String gen="";
					String city=(String) comboBox.getSelectedItem();
					String room="";
					String pay1="";
					String pay2="";
					String pay3="";
					String roomid=textField_3.getText();
					//String pass=textField_4.getText();
					
					if(rdbtnMale.isSelected())
					{
						gen="MALE";
					}
					else
					{
						gen="FEMALE";
					}
					
					if(rdbtnAc.isSelected())
					{
						room="AC";
					}
					else
					{
						room="NONAC";
					}
					
					if(chckbxDc.isSelected()&&chckbxCc.isSelected()&&chckbxCash.isSelected())
					{
						pay1="DC";
						pay2="CC";
						pay3="CASH";
					}
					else if(chckbxDc.isSelected()&&chckbxCc.isSelected())
					{
						pay1="DC";
						pay2="CC";
						pay3="NULL";
					}
					else if(chckbxDc.isSelected()&&chckbxCash.isSelected())
					{
					    pay1="DC";
					    pay2="NULL";
					    pay3="CASH";
					}
					else if(chckbxCc.isSelected()&&chckbxCash.isSelected())
					{
						pay1="NULL";
						pay2="CC";
						pay3="CASH";
					}
					else if(chckbxDc.isSelected())
					{
						pay1="DC";
						pay2="NULL";
						pay3="NULL";
					}
					else if(chckbxCc.isSelected())
					{
						pay1="NULL";
						pay2="CC";
						pay3="NULL";
					}
					else if(chckbxCash.isSelected())
					{
						pay1="NULL";
						pay2="NULL";
						pay3="CASH";
					}

                    String str="insert into reg values('"+userid+"','"+name+"','"+dob+"','"+gen+"','"+city+"','"+room+"','"+pay1+"','"+pay2+"','"+pay3+"','"+roomid+"')";
                    Class.forName("org.h2.Driver");
                    Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
                    Statement st=con.createStatement();
                    st.executeUpdate(str);
                    JOptionPane.showMessageDialog(btnConfirm, "Inserted...");
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnConfirm.setBounds(234, 750, 144, 38);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(new Color(199, 21, 133));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) 
			{
			  textField.setText("") ;  	
			  textField_1.setText("");
			  textField_2.setText("");
			  textField_3.setText("");
			}
		});
		btnCancel.setFont(new Font("Cambria Math", Font.BOLD, 20));
		btnCancel.setBounds(535, 751, 131, 38);
		contentPane.add(btnCancel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(new Color(128, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) 
			{
				if(e2.getSource()==btnBack)
				{
					new Hotel().setVisible(true);
					close();
				}
			}
		});
		btnBack.setFont(new Font("Candara", Font.BOLD, 20));
		btnBack.setBounds(769, 797, 97, 31);
		contentPane.add(btnBack);
		
		
		
	
	}
}
