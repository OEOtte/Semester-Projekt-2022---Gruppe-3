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

public class Kvittering extends JDialog {
	private JTable table_3;
	private JTable table;
	private JTable table_1;
	private JTable table_4;
	private JLabel lblProductname;
	private JLabel lblAmount;
	private JLabel lblPriceWithTax;
	private JLabel lblTax;
	private JLabel lblNewLabel_5;
	private JLabel lblSlgernavn;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane);
			GridBagLayout gbl_buttonPane = new GridBagLayout();
			gbl_buttonPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 60, -14, -16, 63, 0, 0, 0, 0, 15, 73, 19, 57, 0};
			gbl_buttonPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_buttonPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_buttonPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			buttonPane.setLayout(gbl_buttonPane);
			
			JLabel lblNewLabel = new JLabel("Kvittering");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 6;
			gbc_lblNewLabel.gridy = 0;
			buttonPane.add(lblNewLabel, gbc_lblNewLabel);
			
			lblNewLabel_5 = new JLabel("Sælger:");
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 10;
			gbc_lblNewLabel_5.gridy = 0;
			buttonPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
			
			lblSlgernavn = new JLabel("SÆLGERNAVN");
			lblSlgernavn.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblSlgernavn = new GridBagConstraints();
			gbc_lblSlgernavn.insets = new Insets(0, 0, 5, 5);
			gbc_lblSlgernavn.gridx = 13;
			gbc_lblSlgernavn.gridy = 0;
			buttonPane.add(lblSlgernavn, gbc_lblSlgernavn);
			
			lblProductname = new JLabel("Produkt navn");
			GridBagConstraints gbc_lblProductname = new GridBagConstraints();
			gbc_lblProductname.anchor = GridBagConstraints.WEST;
			gbc_lblProductname.insets = new Insets(0, 0, 5, 5);
			gbc_lblProductname.gridx = 2;
			gbc_lblProductname.gridy = 1;
			buttonPane.add(lblProductname, gbc_lblProductname);
			
			lblAmount = new JLabel("Antal");
			GridBagConstraints gbc_lblAmount = new GridBagConstraints();
			gbc_lblAmount.insets = new Insets(0, 0, 5, 5);
			gbc_lblAmount.gridx = 6;
			gbc_lblAmount.gridy = 1;
			buttonPane.add(lblAmount, gbc_lblAmount);
			
			lblPriceWithTax = new JLabel("Pris m. moms");
			GridBagConstraints gbc_lblPriceWithTax = new GridBagConstraints();
			gbc_lblPriceWithTax.gridwidth = 2;
			gbc_lblPriceWithTax.insets = new Insets(0, 0, 5, 5);
			gbc_lblPriceWithTax.gridx = 9;
			gbc_lblPriceWithTax.gridy = 1;
			buttonPane.add(lblPriceWithTax, gbc_lblPriceWithTax);
			
			lblTax = new JLabel("Moms");
			GridBagConstraints gbc_lblTax = new GridBagConstraints();
			gbc_lblTax.gridwidth = 2;
			gbc_lblTax.insets = new Insets(0, 0, 5, 5);
			gbc_lblTax.gridx = 13;
			gbc_lblTax.gridy = 1;
			buttonPane.add(lblTax, gbc_lblTax);
			
			table_3 = new JTable();
			GridBagConstraints gbc_table_3 = new GridBagConstraints();
			gbc_table_3.gridheight = 6;
			gbc_table_3.gridwidth = 4;
			gbc_table_3.insets = new Insets(0, 0, 5, 5);
			gbc_table_3.fill = GridBagConstraints.BOTH;
			gbc_table_3.gridx = 1;
			gbc_table_3.gridy = 2;
			buttonPane.add(table_3, gbc_table_3);
			
			table = new JTable();
			GridBagConstraints gbc_table = new GridBagConstraints();
			gbc_table.gridheight = 6;
			gbc_table.gridwidth = 4;
			gbc_table.insets = new Insets(0, 0, 5, 5);
			gbc_table.fill = GridBagConstraints.BOTH;
			gbc_table.gridx = 5;
			gbc_table.gridy = 2;
			buttonPane.add(table, gbc_table);
			
			table_1 = new JTable();
			GridBagConstraints gbc_table_1 = new GridBagConstraints();
			gbc_table_1.gridheight = 6;
			gbc_table_1.gridwidth = 4;
			gbc_table_1.insets = new Insets(0, 0, 5, 5);
			gbc_table_1.fill = GridBagConstraints.BOTH;
			gbc_table_1.gridx = 9;
			gbc_table_1.gridy = 2;
			buttonPane.add(table_1, gbc_table_1);
			
			table_4 = new JTable();
			GridBagConstraints gbc_table_4 = new GridBagConstraints();
			gbc_table_4.gridwidth = 2;
			gbc_table_4.gridheight = 6;
			gbc_table_4.insets = new Insets(0, 0, 5, 5);
			gbc_table_4.fill = GridBagConstraints.BOTH;
			gbc_table_4.gridx = 13;
			gbc_table_4.gridy = 2;
			buttonPane.add(table_4, gbc_table_4);
			
			JButton btnNewButton = new JButton("Færdig");
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton.gridwidth = 3;
			gbc_btnNewButton.gridx = 13;
			gbc_btnNewButton.gridy = 8;
			buttonPane.add(btnNewButton, gbc_btnNewButton);
		}
	}

}
