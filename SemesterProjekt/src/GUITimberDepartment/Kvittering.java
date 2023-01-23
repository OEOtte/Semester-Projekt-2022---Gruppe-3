package GUITimberDepartment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CustomerRelated.Customer;
import model.ProductRelated.Product;

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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Kvittering extends JDialog {
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JLabel lblNewLabel_6;
	private JTable table_6;
	private JTable table_4;
	private JTable table_5;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JTable table_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextPane textAssistent;
	private JTextPane textKlok;
	private JTextPane textDato;
	private JTextPane textTotalPris;
	private JTextPane textMoms;
	private JTextPane textRabat;
	private JList listProduktNavn;
	private JList listPrisTotal;
	private JList listMoms;
	private JPanel panel_2;
	private JTextPane txtpnordre;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_11;
	private JTextPane txtpnkontonummerlaves;

	/**
	 * Create the dialog.
	 */
	public Kvittering() {
		setBounds(100, 100, 684, 593);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{14, 230, 162, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{43, 32, 26, 28, 32, 0, 37, 26, 37, 0, 29, 36, 33, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel_5 = new JLabel("Kvittering");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 0;
		getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 12;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{86, 77, 62, 0};
		gbl_panel.rowHeights = new int[]{0, 173, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Produktnavn");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Pris m moms");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Moms");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 0;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		listProduktNavn = new JList();
		GridBagConstraints gbc_listProduktNavn = new GridBagConstraints();
		gbc_listProduktNavn.insets = new Insets(0, 0, 0, 5);
		gbc_listProduktNavn.fill = GridBagConstraints.BOTH;
		gbc_listProduktNavn.gridx = 0;
		gbc_listProduktNavn.gridy = 1;
		panel.add(listProduktNavn, gbc_listProduktNavn);
		
		listPrisTotal = new JList();
		GridBagConstraints gbc_listPrisTotal = new GridBagConstraints();
		gbc_listPrisTotal.insets = new Insets(0, 0, 0, 5);
		gbc_listPrisTotal.fill = GridBagConstraints.BOTH;
		gbc_listPrisTotal.gridx = 1;
		gbc_listPrisTotal.gridy = 1;
		panel.add(listPrisTotal, gbc_listPrisTotal);
		
		listMoms = new JList();
		GridBagConstraints gbc_listMoms = new GridBagConstraints();
		gbc_listMoms.fill = GridBagConstraints.BOTH;
		gbc_listMoms.gridx = 2;
		gbc_listMoms.gridy = 1;
		panel.add(listMoms, gbc_listMoms);
		
		lblNewLabel_9 = new JLabel("Dato");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		getContentPane().add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textDato = new JTextPane();
		textDato.setEditable(false);
		textDato.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		GridBagConstraints gbc_textDato = new GridBagConstraints();
		gbc_textDato.gridwidth = 4;
		gbc_textDato.insets = new Insets(0, 0, 5, 5);
		gbc_textDato.fill = GridBagConstraints.BOTH;
		gbc_textDato.gridx = 3;
		gbc_textDato.gridy = 1;
		getContentPane().add(textDato, gbc_textDato);
		
		lblNewLabel_8 = new JLabel("Klokkeslæt");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 2;
		getContentPane().add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textKlok = new JTextPane();
		textKlok.setEditable(false);
		textKlok.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
		GridBagConstraints gbc_textKlok = new GridBagConstraints();
		gbc_textKlok.gridwidth = 4;
		gbc_textKlok.insets = new Insets(0, 0, 5, 5);
		gbc_textKlok.fill = GridBagConstraints.BOTH;
		gbc_textKlok.gridx = 3;
		gbc_textKlok.gridy = 2;
		getContentPane().add(textKlok, gbc_textKlok);
		
		lblNewLabel_10 = new JLabel("Sælger");
		lblNewLabel_10.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 3;
		getContentPane().add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textAssistent = new JTextPane();
		textAssistent.setText("Paul (TIMBER)");
		textAssistent.setEditable(false);
		GridBagConstraints gbc_textAssistent = new GridBagConstraints();
		gbc_textAssistent.gridwidth = 4;
		gbc_textAssistent.insets = new Insets(0, 0, 5, 5);
		gbc_textAssistent.fill = GridBagConstraints.BOTH;
		gbc_textAssistent.gridx = 3;
		gbc_textAssistent.gridy = 3;
		getContentPane().add(textAssistent, gbc_textAssistent);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridheight = 6;
		gbc_panel_2.gridwidth = 5;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 4;
		getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{128, 0, 0, 0, 86, 5, 0};
		gbl_panel_2.rowHeights = new int[]{26, 4, 250, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 6.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel_1 = new JLabel("Ordrenummer");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtpnordre = new JTextPane();
		txtpnordre.setText("//ORDRENUMMERLAVES");
		txtpnordre.setEditable(false);
		GridBagConstraints gbc_txtpnordre = new GridBagConstraints();
		gbc_txtpnordre.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnordre.fill = GridBagConstraints.BOTH;
		gbc_txtpnordre.gridx = 5;
		gbc_txtpnordre.gridy = 0;
		panel_2.add(txtpnordre, gbc_txtpnordre);
		
		lblNewLabel_11 = new JLabel("Kontonummer");
		lblNewLabel_11.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 4;
		gbc_lblNewLabel_11.gridy = 1;
		panel_2.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		txtpnkontonummerlaves = new JTextPane();
		txtpnkontonummerlaves.setText("//KONTONUMMERLAVES");
		txtpnkontonummerlaves.setEditable(false);
		GridBagConstraints gbc_txtpnkontonummerlaves = new GridBagConstraints();
		gbc_txtpnkontonummerlaves.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnkontonummerlaves.fill = GridBagConstraints.BOTH;
		gbc_txtpnkontonummerlaves.gridx = 5;
		gbc_txtpnkontonummerlaves.gridy = 1;
		panel_2.add(txtpnkontonummerlaves, gbc_txtpnkontonummerlaves);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 6;
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 11;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 89, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{16, 18, 9, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_6 = new JLabel("Rabat");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 0;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textRabat = new JTextPane();
		textRabat.setEditable(false);
		GridBagConstraints gbc_textRabat = new GridBagConstraints();
		gbc_textRabat.gridwidth = 3;
		gbc_textRabat.insets = new Insets(0, 0, 5, 5);
		gbc_textRabat.fill = GridBagConstraints.BOTH;
		gbc_textRabat.gridx = 4;
		gbc_textRabat.gridy = 0;
		panel_1.add(textRabat, gbc_textRabat);
		
		table_4 = new JTable();
		GridBagConstraints gbc_table_4 = new GridBagConstraints();
		gbc_table_4.insets = new Insets(0, 0, 5, 0);
		gbc_table_4.fill = GridBagConstraints.BOTH;
		gbc_table_4.gridx = 7;
		gbc_table_4.gridy = 0;
		panel_1.add(table_4, gbc_table_4);
		
		table_6 = new JTable();
		GridBagConstraints gbc_table_6 = new GridBagConstraints();
		gbc_table_6.insets = new Insets(0, 0, 5, 5);
		gbc_table_6.fill = GridBagConstraints.BOTH;
		gbc_table_6.gridx = 0;
		gbc_table_6.gridy = 1;
		panel_1.add(table_6, gbc_table_6);
		
		lblNewLabel_4 = new JLabel("Momsbeløb");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 1;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textMoms = new JTextPane();
		textMoms.setEditable(false);
		GridBagConstraints gbc_textMoms = new GridBagConstraints();
		gbc_textMoms.gridwidth = 3;
		gbc_textMoms.insets = new Insets(0, 0, 5, 5);
		gbc_textMoms.fill = GridBagConstraints.BOTH;
		gbc_textMoms.gridx = 4;
		gbc_textMoms.gridy = 1;
		panel_1.add(textMoms, gbc_textMoms);
		
		table_7 = new JTable();
		GridBagConstraints gbc_table_7 = new GridBagConstraints();
		gbc_table_7.insets = new Insets(0, 0, 5, 0);
		gbc_table_7.fill = GridBagConstraints.BOTH;
		gbc_table_7.gridx = 7;
		gbc_table_7.gridy = 1;
		panel_1.add(table_7, gbc_table_7);
		
		lblNewLabel_7 = new JLabel("Total beløb");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 2;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textTotalPris = new JTextPane();
		textTotalPris.setEditable(false);
		GridBagConstraints gbc_textTotalPris = new GridBagConstraints();
		gbc_textTotalPris.insets = new Insets(0, 0, 0, 5);
		gbc_textTotalPris.gridwidth = 3;
		gbc_textTotalPris.fill = GridBagConstraints.BOTH;
		gbc_textTotalPris.gridx = 4;
		gbc_textTotalPris.gridy = 2;
		panel_1.add(textTotalPris, gbc_textTotalPris);
		
		table_5 = new JTable();
		GridBagConstraints gbc_table_5 = new GridBagConstraints();
		gbc_table_5.fill = GridBagConstraints.BOTH;
		gbc_table_5.gridx = 7;
		gbc_table_5.gridy = 2;
		panel_1.add(table_5, gbc_table_5);
		
		btnNewButton = new JButton("Godkend");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onGodkendClicked();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 13;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

	protected void onGodkendClicked() {
		GUI gui = new GUI().getFrame();
		gui.setVisible(true);
		super.setVisible(false);
	}

	public void setInfo(Customer c, JList<Product> list) {
		// TODO Auto-generated method stub
		
	}

}
