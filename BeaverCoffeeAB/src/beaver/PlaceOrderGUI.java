package beaver;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlaceOrderGUI extends JFrame {
	
	private JLabel lblBrewedCoffe;
	private JTextField tfBrewedCoffe;
	
	private JLabel lblEspresso;
	private JTextField tfEspresso;
	
	private JLabel lblLatte;
	private JTextField tfLatte;
	
	private JLabel lblCappuccino;
	private JTextField tfCappuccino;
	
	private JLabel lblChocolate;
	private JTextField tfChocolate;
	
	private JLabel lblLine;
	private JLabel lblSyrups;
	
	private JLabel lblVanilla;
	private JTextField tfVanilla;
	
	private JLabel lblCaramel;
	private JTextField tfCaramel;
	
	private JLabel lblIrishCoffe;
	private JTextField tfIrishCoffe;
	
	private JButton btnConfirm;
	
	public PlaceOrderGUI() {
		addFrame();
		setVisible(true);
	}
	
	public void addFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(200, 50, 800, 600);
		addComponents();
	}
	
	public void addComponents() {
		setLayout(null);
		
		lblBrewedCoffe = new JLabel("Brewed Coffe");
		lblBrewedCoffe.setBounds(50, 60, 100, 20);
		add(lblBrewedCoffe);
		tfBrewedCoffe = new JTextField();
		tfBrewedCoffe.setBounds(150, 60, 50, 20);
		add(tfBrewedCoffe);
		
		lblEspresso = new JLabel("Espresso");
		lblEspresso.setBounds(50, 120, 100, 20);
		add(lblEspresso);
		tfEspresso = new JTextField();
		tfEspresso.setBounds(150, 120, 50, 20);
		add(tfEspresso);
		
		lblLatte = new JLabel("Latte");
		lblLatte.setBounds(50, 180, 100, 20);
		add(lblLatte);
		tfLatte = new JTextField();
		tfLatte.setBounds(150, 180, 50, 20);
		add(tfLatte);
		
		lblCappuccino = new JLabel("Cappuccino");
		lblCappuccino.setBounds(50, 240, 100, 20);
		add(lblCappuccino);
		tfCappuccino = new JTextField();
		tfCappuccino.setBounds(150, 240, 50, 20);
		add(tfCappuccino);
		
		lblChocolate = new JLabel("Chocolate");
		lblChocolate.setBounds(50, 300, 100, 20);
		add(lblChocolate);
		tfChocolate = new JTextField();
		tfChocolate.setBounds(150, 300, 50, 20);
		add(tfChocolate);
		
		lblLine = new JLabel("------------------------------------------------------------------------------------------");
		lblLine.setBounds(50, 360, 800, 20);
		add(lblLine);
		
		lblSyrups = new JLabel("Syrups");
		lblSyrups.setBounds(50, 380, 50, 20);
		add(lblSyrups);
		
		lblVanilla = new JLabel("Vanilla");
		lblVanilla.setBounds(50, 400, 100, 20);
		add(lblVanilla);
		tfVanilla = new JTextField();
		tfVanilla.setBounds(150, 400, 50, 20);
		add(tfVanilla);
		
		lblCaramel = new JLabel("Caramel");
		lblCaramel.setBounds(50, 420, 100, 20);
		add(lblCaramel);
		tfCaramel = new JTextField();
		tfCaramel.setBounds(150, 420, 50, 20);
		add(tfCaramel);
		
		lblIrishCoffe = new JLabel("Irish Coffe");
		lblIrishCoffe.setBounds(50, 440, 100, 20);
		add(lblIrishCoffe);
		tfIrishCoffe = new JTextField();
		tfIrishCoffe.setBounds(150, 440, 50, 20);
		add(tfIrishCoffe);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(650, 500, 100, 40);
		add(btnConfirm);
	}
	
	
}
