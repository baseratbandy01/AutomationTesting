package creatCommandLineApplication;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingClass_GUIApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() //This create the swing thread in which it will run
				{

			@Override
			public void run() {
				//if below code is run it will run but willl not be visible to us
				JFrame farme=new JFrame("Hello World Swing!");
				farme.setSize(500, 400);//to set size of frame
				farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make it terminate or close the command is after run
				farme.setVisible(true);//to make it visible we can give below command
			}
			
		});
		
			
	}//end main

}//end class
