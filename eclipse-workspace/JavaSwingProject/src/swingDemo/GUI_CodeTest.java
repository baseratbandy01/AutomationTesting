	package swingDemo;
	
	import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
	
	public class GUI_CodeTest {
		
	public static void main(String[] args) {
		
		TestGUI objTest=new TestGUI();
		
		
		}//end main method
	}//end class
	class TestGUI extends JFrame{
		
		public TestGUI() {
			
			//to apply some text in Jframe we need some component that is JLabel 
			//and need to pass text  what ever we need on frame
			JLabel lable=new JLabel("Hello World !");
			JLabel lable1=new JLabel("Welcome Irfan !");
			add(lable);
			add(lable1);
			
			//by default JFrame follows card layout one comopnent is overwriting other comopnent
			//for that we need setlayout
			//Option for setLayout are:-flowlayout,gridalayout,broaderLayOut null as well
			//if we want to add more texts or lables in our frame we can use flowlayout
			setLayout(new FlowLayout());
			setVisible(true);  //by defaulte JFrame is invisble first it need to be visible
										//for that methods is
			setSize(400, 400);//to set size of frame
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make it close otherwise it keep running 
			//For every code we need above four statement
		}//end of constructor
	}//end classs