package beaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JoinClubGUI extends JFrame implements ActionListener{
	
	private JLabel lblJoinClub;
	
	private JLabel lblAdress;
	private JTextField tfAdress;
	
	private JLabel lblNbr;
	private JTextField tfNbr;
	
	private JButton btnConfirm;
	
	
	
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
		
		lblAdress = new JLabel("Address");
		lblAdress.setBounds(120, 150, 50, 20);
		add(lblAdress);
		tfAdress = new JTextField();
		tfAdress.setBounds(300, 150, 100, 20);
		add(tfAdress);
		
		lblNbr = new JLabel("Person Nummer/SSN");
		lblNbr.setBounds(120, 100, 200, 20);
		add(lblNbr);
		tfNbr = new JTextField();
		tfNbr.setBounds(300, 100, 100, 20);
		add(tfNbr);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(650, 500, 100, 40);
		btnConfirm.addActionListener(this);
		add(btnConfirm);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConfirm) {
			dispose();
		}
		
	}
}
