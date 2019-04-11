package calculater;
//to creat Swing project first we need to create normal jave project
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculator_Class {

	private JFrame frame;
	private JLabel Label1;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Class window = new Calculator_Class();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}//end catch block
			}//end run method
		});
	}//end main method

	/**
	 * Create the application.
	 */
	public Calculator_Class() {
		initialize();
	}//end  class

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Button = new JButton("Show Message");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//JOptionPane.showMessageDialog(null, "Hello I am Learing Swing....");
				String name=textField.getText();
				if(name.equalsIgnoreCase("Women")) {
					Label1.setText("Correct Name");
				}else {
					Label1.setText("Incorrect Name..");
				}
			}
		});
		Button.setForeground(new Color(0, 0, 51));
		Button.setBackground(Color.WHITE);
		Button.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button.setBounds(80, 127, 177, 23);
		frame.getContentPane().add(Button);
		
		 Label1 = new JLabel("Enter number");
		Label1.setBounds(21, 56, 100, 23);
		frame.getContentPane().add(Label1);
		
		textField = new JTextField(15);
		textField.setBounds(171, 57, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}//end method
}//end main class
