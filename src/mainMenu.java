import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mainMenu {

	public static void CLMM() {
		//creating of Command-line main menu
		System.out.println("Welcome to the Easy Award Creation Tool");
		System.out.println("This is the command-line variant, for GUI use GUI Executable");
		String classVar = classType.setClassType();
		
		System.out.println("Now time for students...");
		students.printRoster(students.getStudRoster());
		
	}
	
	public static void GUIMM() {
		gui.main(null);
		
		/*/gui needs to be created still!
		System.out.println("Starting GUI...");
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300, 300);
		window.setTitle("Award Creator");
		JButton mafButton = new JButton("AA/MAF");
		JButton abButton = new JButton("AB");
		JButton bbButton = new JButton("BB");
		window.add(BorderLayout.PAGE_START, mafButton);
		window.add(BorderLayout.CENTER, abButton);
		window.add(BorderLayout.AFTER_LAST_LINE, bbButton);
		
		window.setVisible(true);
		*/
	}
}
