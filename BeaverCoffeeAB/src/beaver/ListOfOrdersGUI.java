package beaver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class ListOfOrdersGUI extends JFrame implements ActionListener {
	private JTable table;
	private JButton btnConfirm;
	private Main main;
	
	
	public ListOfOrdersGUI(Main main) {
		super("List of Orders");
		this.main = main;
		addFrame();
		addButton();
		addTable();
		setVisible(true);
		

	}
	
	public void addFrame() {
		setResizable(false);
		setBounds(200, 50, 800, 600);
		setLayout(null);
	}
	
	public void addButton() {
		btnConfirm = new JButton("Exit");
		
		btnConfirm.addActionListener(this);
		btnConfirm.setBounds(600, 500, 150, 40);
		add(btnConfirm);
	}
	
	public void addTable() {
		String[] columnNames = {"Order", "Brewed Coffee", "Espresso", "Latte", "Cappuccino", "Chocolate", "Vanilla", "Caramel", "Irish Coffee"};
		ArrayList<Object[]> list = main.getOrders();
		Object[][] data = new Object[list.size()][9];
		for(int i = 0; i<list.size();i++) {
			data[i] = list.get(i);
		}
		
		table = new JTable(data, columnNames);
		
		JTableHeader header = table.getTableHeader();
		JPanel panel = new JPanel();
		panel.add(header);
		panel.add(table);
		panel.setBounds(0,0,730,440);
		add(panel);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConfirm) {
			dispose();
		}
	}
}