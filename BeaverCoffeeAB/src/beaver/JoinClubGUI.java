package beaver;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JoinClubGUI extends JFrame {
	
	private JLabel lblJoinClub;
	
	private JLabel lblID;
	private JTextField tfID;
	
	public JoinClubGUI() {
		addFrame();
		setVisible(true);
	}
	
	public void addFrame() {
		setResizable(false);
		setBounds(300, 50, 800, 600);
		addComponents();
	}

	
	public void addComponents() {
		setLayout(null);
		lblJoinClub = new JLabel("Join Club!");
		lblJoinClub.setBounds(80, 60, 100, 20);
		add(lblJoinClub);
		
		lblID = new JLabel("ID");
		lblID.setBounds(120, 100, 50, 20);
		add(lblID);
		tfID = new JTextField();
		tfID.setBounds(240, 100, 80, 20);
		add(tfID);
		
	}
}
