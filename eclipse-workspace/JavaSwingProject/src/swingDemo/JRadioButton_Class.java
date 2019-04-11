package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class JRadioButton_Class {

	public static void main(String[] args) {
		
		RadioDemo objRadioDemo=new RadioDemo();
	}

}
 class RadioDemo extends JFrame implements ActionListener{
	 
	 JTextField text;
	 JButton button;
	 JRadioButton rb1,rb2;
	 JLabel label;
	 JCheckBox checkBox1;
	 JCheckBox checkBox2;
	 
	 public RadioDemo() {
		 text = new JTextField(15);
		 button= new JButton("Ok");
		 rb1=new JRadioButton("Male");
		 rb2=new JRadioButton("Female");
		 label=new JLabel("Greeting");
		 checkBox1=new JCheckBox("Dancing");
		 checkBox2=new JCheckBox("cooking");//checkbox 
		//radioButtons need to be grouped so that their will be only one selection like
		 ButtonGroup bg=new ButtonGroup();
		 //if raiodbutton male is selected then female radioButton will be automatically deselected
		 bg.add(rb1);
		 bg.add(rb2);
		 
		 add(text);
		 add(rb1);
		 add(rb2);
		 add(checkBox1);
		 add(checkBox2);
		 add(button,FlowLayout.TRAILING);
		 add(label);
		 
		 //below method is listener for checkbox 
		 /*checkBox1.addItemListener(new ItemListener()
		 {
			 public void itemStateChanged(ItemEvent e) {
				 System.out.println("Dancer");
			 }//end method
		 });//listener
*/		 
		 button.addActionListener(this);
		 
		 	setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }//end construtor
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name=text.getText();
		if(rb1.isSelected()) {
			name="Mr " + name;
		}//ends if looop
		else {
			name="Ms " + name;
		}//end else loop
		if(checkBox1.isSelected()) {
			name=name + "  Dancing";
		}
		if(checkBox2.isSelected()) {
			name=name + "  cooking";
		}
		label.setText(name);
	}//end method
	 
 }//end class