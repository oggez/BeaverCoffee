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
	private JButton btnUpdate;
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
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(40, 500, 150, 40);
		btnUpdate.addActionListener(this);
		add(btnConfirm);
		add(btnUpdate);
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
		header.setReorderingAllowed(false);
		header.setResizingAllowed(false);
		panel.add(header);
		panel.add(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.setBounds(0,0,730,440);
		
		add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConfirm) {
			dispose();
		} else if(e.getSource() == btnUpdate) {
			
			int index = table.getSelectedRow();
			Object id = table.getValueAt(index, 0);
			int brewedCoffee = Integer.parseInt(table.getValueAt(index, 1).toString());
			int espresso = Integer.parseInt(table.getValueAt(index, 2).toString());
			int latte = Integer.parseInt(table.getValueAt(index, 3).toString());
			int cappuccino = Integer.parseInt(table.getValueAt(index, 4).toString());
			int chocolate = Integer.parseInt(table.getValueAt(index, 5).toString());
			int vanilla = Integer.parseInt(table.getValueAt(index, 6).toString());
			int caramel = Integer.parseInt(table.getValueAt(index, 7).toString());
			int irishCoffee = Integer.parseInt(table.getValueAt(index, 8).toString());
			main.updateOrder(id, brewedCoffee, espresso, latte, cappuccino, chocolate, vanilla, caramel, irishCoffee);
		}
	}
}