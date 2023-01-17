package GUITimberDepartment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JList;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kvittering extends JDialog {
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JTable table;
	private JPanel panel_1;
	private JLabel lblNewLabel_6;
	private JTable table_6;
	private JTable table_4;
	private JTable table_5;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JTable table_7;
	private JLabel lblNewLabel_8;
	private JTextField textField;
	private JLabel lblNewLabel_9;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_10;
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Kvittering dialog = new Kvittering();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Kvittering() {
		setBounds(100, 100, 684, 593);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 224, 162, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{32, 0, 0, 26, 92, 0, 29, 36, 33, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel_5 = new JLabel("Kvittering");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 0;
		getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblNewLabel_9 = new JLabel("Dato");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 0;
		getContentPane().add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 0;
		getContentPane().add(textField_1, gbc_textField_1);
		
		lblNewLabel_8 = new JLabel("Klokkeslæt");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 1;
		getContentPane().add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 1;
		getContentPane().add(textField_2, gbc_textField_2);
		
		lblNewLabel_10 = new JLabel("Sælger");
		lblNewLabel_10.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 2;
		getContentPane().add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 8;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{11, 101, 0, 0, 62, 16, 0};
		gbl_panel.rowHeights = new int[]{0, 173, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Produktnavn");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Antal");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Pris m moms");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Moms");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 0;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		table_1 = new JTable();
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.insets = new Insets(0, 0, 0, 5);
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 1;
		gbc_table_1.gridy = 1;
		panel.add(table_1, gbc_table_1);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 2;
		gbc_table.gridy = 1;
		panel.add(table, gbc_table);
		
		table_2 = new JTable();
		GridBagConstraints gbc_table_2 = new GridBagConstraints();
		gbc_table_2.insets = new Insets(0, 0, 0, 5);
		gbc_table_2.fill = GridBagConstraints.BOTH;
		gbc_table_2.gridx = 3;
		gbc_table_2.gridy = 1;
		panel.add(table_2, gbc_table_2);
		
		table_3 = new JTable();
		GridBagConstraints gbc_table_3 = new GridBagConstraints();
		gbc_table_3.insets = new Insets(0, 0, 0, 5);
		gbc_table_3.fill = GridBagConstraints.BOTH;
		gbc_table_3.gridx = 4;
		gbc_table_3.gridy = 1;
		panel.add(table_3, gbc_table_3);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 5;
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 7;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{16, 18, 9, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_6 = new JLabel("Rabat");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 0;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		table_4 = new JTable();
		GridBagConstraints gbc_table_4 = new GridBagConstraints();
		gbc_table_4.insets = new Insets(0, 0, 5, 5);
		gbc_table_4.fill = GridBagConstraints.BOTH;
		gbc_table_4.gridx = 7;
		gbc_table_4.gridy = 0;
		panel_1.add(table_4, gbc_table_4);
		
		table_8 = new JTable();
		table_8.setToolTipText("");
		GridBagConstraints gbc_table_8 = new GridBagConstraints();
		gbc_table_8.gridwidth = 3;
		gbc_table_8.insets = new Insets(0, 0, 5, 0);
		gbc_table_8.fill = GridBagConstraints.BOTH;
		gbc_table_8.gridx = 8;
		gbc_table_8.gridy = 0;
		panel_1.add(table_8, gbc_table_8);
		
		table_6 = new JTable();
		GridBagConstraints gbc_table_6 = new GridBagConstraints();
		gbc_table_6.insets = new Insets(0, 0, 5, 5);
		gbc_table_6.fill = GridBagConstraints.BOTH;
		gbc_table_6.gridx = 0;
		gbc_table_6.gridy = 1;
		panel_1.add(table_6, gbc_table_6);
		
		lblNewLabel_4 = new JLabel("Total moms");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		table_7 = new JTable();
		GridBagConstraints gbc_table_7 = new GridBagConstraints();
		gbc_table_7.insets = new Insets(0, 0, 5, 5);
		gbc_table_7.fill = GridBagConstraints.BOTH;
		gbc_table_7.gridx = 7;
		gbc_table_7.gridy = 1;
		panel_1.add(table_7, gbc_table_7);
		
		table_9 = new JTable();
		GridBagConstraints gbc_table_9 = new GridBagConstraints();
		gbc_table_9.gridwidth = 3;
		gbc_table_9.insets = new Insets(0, 0, 5, 0);
		gbc_table_9.fill = GridBagConstraints.BOTH;
		gbc_table_9.gridx = 8;
		gbc_table_9.gridy = 1;
		panel_1.add(table_9, gbc_table_9);
		
		lblNewLabel_7 = new JLabel("Total pris");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 2;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		table_5 = new JTable();
		GridBagConstraints gbc_table_5 = new GridBagConstraints();
		gbc_table_5.insets = new Insets(0, 0, 0, 5);
		gbc_table_5.fill = GridBagConstraints.BOTH;
		gbc_table_5.gridx = 7;
		gbc_table_5.gridy = 2;
		panel_1.add(table_5, gbc_table_5);
		
		table_10 = new JTable();
		GridBagConstraints gbc_table_10 = new GridBagConstraints();
		gbc_table_10.gridwidth = 3;
		gbc_table_10.fill = GridBagConstraints.BOTH;
		gbc_table_10.gridx = 8;
		gbc_table_10.gridy = 2;
		panel_1.add(table_10, gbc_table_10);
		
		btnNewButton = new JButton("Godkend");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onGodkendClicked();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 9;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

	protected void onGodkendClicked() {
		GUI gui = new GUI().getFrame();
		gui.setVisible(true);
		super.setVisible(false);
	}

}
