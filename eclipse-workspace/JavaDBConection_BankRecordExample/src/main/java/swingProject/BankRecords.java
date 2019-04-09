package swingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class BankRecords {

	private JFrame frame;
	private JTextField textField;
	private JTextField pwd;
	static String filePath="E://Library//WomenReturnerClientList//ReturnerShipList.xlsx";
	static String sheet="EmployersDetail";
	static AllMethod_Class objAllMethod;
	String customerName;
	String customerPassword;
	double customerBalance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankRecords window = new BankRecords();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public BankRecords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel Label1 = new JLabel("Login");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label1.setBounds(20, 48, 55, 14);
		frame.getContentPane().add(Label1);
		
		textField = new JTextField();
		
		textField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent login) {
		objAllMethod=new AllMethod_Class();
			
			String name=textField.getText();
			customerInfo();
				if(customerName.equalsIgnoreCase(name)) {
					Label1.setText(name);
					}//end if loop
			
					
			}
		});
		textField.setBounds(85, 46, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JLabel Label2 = new JLabel("Password");
		Label2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label2.setBounds(20, 89, 80, 14);
		frame.getContentPane().add(Label2);
		
		pwd = new JTextField();
		pwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pass) {
				customerInfo();
				String password=pwd.getText();
					if(customerPassword.equalsIgnoreCase(password)) {
					Label2.setText(password);
					
				}//end if loop
				
			}//end method
					});
		pwd.setBounds(95, 87, 98, 20);
		frame.getContentPane().add(pwd);
		pwd.setColumns(10);
		
		final JButton enter = new JButton("Submit");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerInfo();
				String name=textField.getText();
				String password=pwd.getText();
				if(customerName.equalsIgnoreCase(name)) {
					if(customerPassword.equalsIgnoreCase(password)) {
						JOptionPane.showMessageDialog(null, "You are valid customer");
						}//end if loop	
					else{
						JOptionPane.showMessageDialog(null, "You are Invalid Customer");
					}//end else loop
						
						}//nd if loop
				
			}
			
		});
		enter.setFont(new Font("Tahoma", Font.BOLD, 13));
		enter.setBounds(92, 137, 89, 23);
		frame.getContentPane().add(enter);
	}

	public void customerInfo() {
		
			objAllMethod=new AllMethod_Class();
			List<Customer>listOfCustomer=objAllMethod.getEmployeFromFile(sheet,filePath);
			for(Customer custInfo:listOfCustomer) {
				customerName=custInfo.getCustomerName();
				customerPassword=custInfo.getCustomerPassword();
				customerBalance=custInfo.getBalance();
			}//end for loop
		}
		
	}

