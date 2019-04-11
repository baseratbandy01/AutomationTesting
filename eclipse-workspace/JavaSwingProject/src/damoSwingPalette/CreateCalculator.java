package damoSwingPalette;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateCalculator {

	private JFrame frame;
	private JTextField result;
	private JTextField Num1;
	private JTextField Num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCalculator window = new CreateCalculator();
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
	public CreateCalculator() {
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
		
		JLabel lblNewLabel = new JLabel("Answer is..");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(28, 171, 123, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(266, 159, -48, 20);
		frame.getContentPane().add(formattedTextField);
		
		result = new JTextField();
		result.setBounds(141, 170, 106, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		Num1 = new JTextField();
		Num1.setBounds(69, 45, 86, 20);
		frame.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(191, 45, 86, 20);
		frame.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(28, 48, 115, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1+num2;
					result.setText(Integer.toString(ans));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(62, 97, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sub");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1-num2;
					result.setText(Integer.toString(ans));
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(188, 97, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1*num2;
					result.setText(Integer.toString(ans));
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_2.setBounds(310, 97, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
