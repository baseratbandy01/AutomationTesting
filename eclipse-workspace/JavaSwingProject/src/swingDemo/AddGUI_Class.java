package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI_Class {

	public static void main(String[] args) {
		addition objAdd=new addition();

	}//end main method

}//end class
class addition extends JFrame implements ActionListener {
	JLabel lable1;
	JLabel lable2;
	JTextField add1;
	JTextField add2;
	JButton button;
	JLabel lable;
	 public addition(){
		  lable1=new JLabel("Enter First Number");
		  lable2=new JLabel("Enter Second Number");
		 add1=new JTextField(20);
		 add2=new JTextField(20);
		 button=new JButton("Add");
		 lable=new JLabel("Result");
		
		add(lable1);
		add(add1);
		add(lable2);
		add(add2);
		add(button);
		add(lable);
		//to make the buttin it should listen to it nee to add lister
		//ActionListener is an Interface
		button.addActionListener(this);//here we need to pass object of action listener
		 setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//end construtor
	 //whenever we call button it will call actionPerformed method 
	 public void actionPerformed(ActionEvent ae) {
		 
		 int num1=Integer.parseInt(add1.getText());
		 int num2=Integer.parseInt(add2.getText());
		 
		 int total=num1+num2;
		 lable.setText(total+ "");//it is accepting string to change int into string simply +"" in int value
		 }//end ActionPerformed Method
} //end class