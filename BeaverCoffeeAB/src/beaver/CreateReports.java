package beaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CreateReports extends JFrame implements ActionListener {
	private Main main;
	
	public CreateReports(Main main) {
		super("Create Reports");
		this.main = main;
		addFrame();
	}
	
	public void addFrame() {
		setResizable(false);
		setBounds(200, 50, 800, 600);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
