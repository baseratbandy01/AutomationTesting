package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Caller {

	public static void main(String[] args) {
		
		callingAnotherClass objCalling=new callingAnotherClass();
	}

}
class callingAnotherClass extends JFrame implements ActionListener{
	public callingAnotherClass() {
		
		JButton button=new JButton("Add Form");
		button.addActionListener(this);
		add(button);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new addition();
		this.dispose();
		
	}
}