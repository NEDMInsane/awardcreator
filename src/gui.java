import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui {
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JLabel headerLabel;
	
	public gui() {
		initGui();
	}
		
	public static void main(String[] args) {
		gui gui = new gui();
		gui.showMMGui();
	}
	
	private void initGui() {
		//initialization of gui
		mainFrame = new JFrame("Graduation Document Creator");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500, 300);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		mainPanel = new JPanel();
		headerLabel = new JLabel("", JLabel.CENTER);
		
		mainFrame.add(mainPanel);
		mainFrame.add(headerLabel);
		mainPanel.setLayout(new FlowLayout());
		mainFrame.setVisible(true);
	}
	
	private void showMMGui() {
		headerLabel.setText("Please select a course.");
		
		JButton aaButton = new JButton("AA/MAF");
		JButton abButton = new JButton("AB");
		JButton bbButton = new JButton("BB");
		
		aaButton.addActionListener(new buttonListener());
		abButton.addActionListener(new buttonListener());
		bbButton.addActionListener(new buttonListener());
		
		aaButton.setActionCommand("AA");
		abButton.setActionCommand("AB");
		bbButton.setActionCommand("BB");
		
		mainPanel.add(aaButton);
		mainPanel.add(abButton);
		mainPanel.add(bbButton);
		
		mainFrame.setVisible(true);		
	}
	
	private class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if (command.equals("AA")) {
				//Do AA Stuff
			} else if (command.equals("AB")) {
				//Do AB Stuff
			} else if (command.equals("BB")) {
				//Do BB Stuff
			}
			
		}
		
	}

}
