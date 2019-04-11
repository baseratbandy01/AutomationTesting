package calculater;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculater_Swing_Test {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
	}//end main method
	
	
	}//main end class

class Calculator extends JFrame implements ActionListener{
	JFrame frame;
	JLabel lable1;
	JLabel lable2;
	JTextField num1;
	JTextField num2;
	JButton b1;
	JButton b2;
	JLabel label;
	
	public Calculator() {
		frame=new JFrame("Basic calculator");
		  lable1=new JLabel("Enter First Number");
		  lable2=new JLabel("Enter Second Number");
		  num1=new JTextField(10);
		  num2=new JTextField(10);
		  b1=new JButton("Add");
		  b2=new JButton("Sub");
		  label=new JLabel("Total");
		  
		 // add(frame);
		  add(lable1);
		  add(num1);
		  add(lable2);
		  add(num2);
		  add(b1);
		  add(b2);
		  add(label);
		  
		  b1.addActionListener(this);//here we need to pass object of action listener
		  b2.addActionListener(this);
			 setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		  
		  
	}//end constructor

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		int number1=Integer.parseInt(num1.getText());
		int  number2=Integer.parseInt(num2.getText());
		int result=number1+number2;
		int sub=number1-number2;
		label.setText(result +"");
		label.setText(sub +"");
	}
	
}//end classs