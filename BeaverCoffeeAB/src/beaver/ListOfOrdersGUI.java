package beaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ListOfOrdersGUI extends JFrame implements ActionListener {
	private JTable table;
	private JButton btnConfirm;
	public ListOfOrdersGUI() {
		super("List of Orders");
		
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
		String[] columnNames = {"Order", "Update", "Delete"};
		Object[][] data = { };
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table = new JTable(model);
		table.setBounds(30, 30, 730, 440);
		add(table);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConfirm) {
			dispose();
		}
	}
}