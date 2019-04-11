package swingDemo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Testing_GUIEmail_Id {

	public static void main(String[] args) {
		emailId objlogin=new emailId();

	}

}
class emailId extends JFrame implements ActionListener{
	JLabel label1;
	JLabel label2;
	JTextField emailId;
	JTextField password;
	JButton button;
	JLabel label;

	//final JTextArea textArea=new JTextArea(); 
	public emailId() {
		label1=new JLabel("Enter EmailID");
		label2=new JLabel("Enter PassWord");
		 emailId=new JTextField(30);
		 password=new JTextField(30);
		button=new JButton("LogIn");
		label=new JLabel("");
	
		
		add(label1);
		add(emailId);
		add(label2);
		add(password);
		add(button);
		add(label);
		//Container c=getContentPane();
		
		button.addActionListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String str1=emailId.getText();
		String str2=password.getText();
	if(str1.equalsIgnoreCase("irfan_sheikh@hotmail.com")
			&&str2.equalsIgnoreCase("Aamina10!")) {
		
		label.setText("Welcome");
	}else {
		label.setText("invalid password");
	}
		
 	}
}
