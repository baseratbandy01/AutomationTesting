package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game {

	public static void main(String[] args) {
		
		playGame objPlay=new playGame();
	}//end main method

}//end game class

class playGame extends JFrame implements ActionListener{
	JTextField PlayerName;
	JTextField PlayerGusses;
	JFrame frame;
	JLabel name;
	JLabel label1;
	JLabel label2;
	JLabel Gusses;
	JButton button1;
	JButton button2;
	JLabel SongFirstChar;
	//constructor
	public playGame() {
		frame=new JFrame(" Song Game !");
		name=new JLabel("Enter name ");
		PlayerName=new JTextField(10);
		button1=new JButton("OK");
	
		Gusses=new JLabel("Enter Your Gusses ");
		PlayerGusses=new JTextField(10);
		
		button2=new JButton ("Click ");
		
		label1=new JLabel("");
		
		label2=new JLabel("check ");
		
		add(frame);
		add(name);
		add(PlayerName);
		 add(button1);
		add(label1);
		
		
		add(Gusses);
		add(PlayerGusses);
		 add(button1);
		add(label2);
		
	button1.addActionListener(this);
//		button2.addActionListener(this);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end construtor
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=PlayerName.getText();
		String song="Hello ";
		String playerGusses=Gusses.getText();
		label1.setText("Artist Name : Steve :");
		
		if(playerGusses.equalsIgnoreCase(song)) {
			label2.setText("Correct Gusses You Are eligible to gusses another song");
		}//end if loop
		else {
			label2.setText("Sorry Wrong Gussess...");
		}
	}//end method
	
}//end PlayGame