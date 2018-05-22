package beaver;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlaceOrderGUI extends JFrame implements ActionListener{

	private JLabel lblBrewedCoffee;
	private JTextField tfBrewedCoffee;

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

	private JLabel lblIrishCoffee;
	private JTextField tfIrishCoffee;

	private JButton btnConfirm;

	private Main main;
	
	public PlaceOrderGUI(Main main) {
		addFrame();
		this.main = main;
		setVisible(true);
	}

	public void addFrame() {
		setResizable(false);
		setBounds(200, 50, 800, 600);
		addComponents();
	}

	public void addComponents() {
		setLayout(null);

		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		
		lblBrewedCoffee = new JLabel("Brewed Coffee");
		lblBrewedCoffee.setBounds(50, 60, 100, 20);
		add(lblBrewedCoffee);
		tfBrewedCoffee = new JTextField();
		tfBrewedCoffee.setBounds(150, 60, 50, 20);
		add(tfBrewedCoffee);

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

		lblLine = new JLabel(
				"------------------------------------------------------------------------------------------");
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

		lblIrishCoffee = new JLabel("Irish Coffee");
		lblIrishCoffee.setBounds(50, 440, 100, 20);
		add(lblIrishCoffee);
		tfIrishCoffee = new JTextField();
		tfIrishCoffee.setBounds(150, 440, 50, 20);
		add(tfIrishCoffee);

		btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(650, 500, 100, 40);
		add(btnConfirm);
		btnConfirm.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConfirm) {
			main.addOrder(Integer.parseInt((tfBrewedCoffee.getText())), Integer.parseInt((tfEspresso.getText())), Integer.parseInt((tfLatte.getText())), Integer.parseInt((tfCappuccino.getText())), Integer.parseInt((tfChocolate.getText())), Integer.parseInt((tfVanilla.getText())), Integer.parseInt((tfCaramel.getText())), Integer.parseInt((tfIrishCoffee.getText())));
			
			
		}
		
	}

}
