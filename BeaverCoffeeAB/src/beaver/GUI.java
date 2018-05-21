package beaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
	private JButton btnPlaceOrder;
	private JButton btnListOfOrders;
	private JButton btnJoinClub;
	private JButton btnEmployees;
	private JButton btnAddEmployees;
	private JButton btnCreateReport;
	
	private JComboBox<String> accessControlDropDown;
	
	public GUI() {
		super("BeaverCoffee");
		addFrame();
		addButtons();
		addAccessControlDropDown();
		setVisible(true);
	}
	
	

	public void addFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(200, 50, 800, 600);
		setLayout(null);
	}
	
	public void addButtons() {
		btnPlaceOrder = new JButton("Place Order");
		btnListOfOrders = new JButton("List of Orders");
		btnJoinClub = new JButton("Join Club");
		btnEmployees = new JButton("Employees");
		btnAddEmployees = new JButton("Add Employee");
		btnCreateReport = new JButton("Create Report");
		
		btnPlaceOrder.addActionListener(this);
		btnListOfOrders.addActionListener(this);
		btnJoinClub.addActionListener(this);
		btnEmployees.addActionListener(this);
		btnAddEmployees.addActionListener(this);
		btnCreateReport.addActionListener(this);
		
		btnPlaceOrder.setBounds(90, 30, 150, 40);
		add(btnPlaceOrder);
		
		btnListOfOrders.setBounds(310, 30, 150, 40);
		add(btnListOfOrders);
		
		btnJoinClub.setBounds(530, 30, 150, 40);
		add(btnJoinClub);
		
		btnEmployees.setBounds(90, 150, 150, 40);
		add(btnEmployees);
		
		btnAddEmployees.setBounds(310, 150, 150, 40);
		add(btnAddEmployees);
		
		btnCreateReport.setBounds(530, 150, 150, 40);
		add(btnCreateReport);
		
		btnEmployees.setEnabled(false);
		btnAddEmployees.setEnabled(false);
		btnCreateReport.setEnabled(false);

	}
	
	private void addAccessControlDropDown() {
		String[] accessControl = {"Employee", "Employeer", "Location Manager"};
		accessControlDropDown = new JComboBox<String>(accessControl);
		accessControlDropDown.setBounds(40, 500, 150, 20);
		accessControlDropDown.addActionListener(this);
		add(accessControlDropDown);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == accessControlDropDown) {
			int index = accessControlDropDown.getSelectedIndex();
			
			if(index == 0) {
				btnEmployees.setEnabled(false);
				btnAddEmployees.setEnabled(false);
				btnCreateReport.setEnabled(false);

			} else if(index == 1) {
				btnEmployees.setEnabled(true);
				btnAddEmployees.setEnabled(true);
				btnCreateReport.setEnabled(false);

			} else if(index == 2) {
				btnEmployees.setEnabled(true);
				btnAddEmployees.setEnabled(true);
				btnCreateReport.setEnabled(true);
			}
		} else if(e.getSource() == btnPlaceOrder) {
			
		} else if(e.getSource() == btnListOfOrders) {
			ListOfOrdersGUI orderList = new ListOfOrdersGUI();
		}
	}
}
