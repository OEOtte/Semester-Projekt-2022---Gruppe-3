package GUITimberDepartment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class FindKonto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtinputField;
	private JList<Customer> list;
	private JTextPane txtpnXx;
	private boolean customerSelected = false;
	private JButton btnGodkend;
	private JButton okButton;
	private JButton cancelButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private Customer customer;
	private static FindKonto instance;

	public static FindKonto getInstance() {
		if (instance == null) {
			instance = new FindKonto();
		}
		return instance;
	}
	
	/**
	 * Create the dialog.
	 */
	private FindKonto() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.gridwidth = 7;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblNewLabel = new JLabel("Telefonnummer");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				txtinputField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 0;
				panel.add(txtinputField, gbc_textField);
				txtinputField.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 5;
			gbc_panel.gridwidth = 7;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 2;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				btnNewButton = new JButton("Søg  ");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onSearchClicked();
					}
				});
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridwidth = 3;
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
				gbc_btnNewButton.gridx = 12;
				gbc_btnNewButton.gridy = 0;
				panel.add(btnNewButton, gbc_btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Tilføj");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onAddClicked();
					}
				});
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.gridwidth = 3;
				gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
				gbc_btnNewButton_1.gridx = 12;
				gbc_btnNewButton_1.gridy = 1;
				panel.add(btnNewButton_1, gbc_btnNewButton_1);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridwidth = 12;
				gbc_scrollPane.gridheight = 5;
				gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 0;
				gbc_scrollPane.gridy = 0;
				panel.add(scrollPane, gbc_scrollPane);
				{
					list = new JList();
					scrollPane.setViewportView(list);
				}
			}
			{
				txtpnXx = new JTextPane();
				GridBagConstraints gbc_txtpnXx = new GridBagConstraints();
				gbc_txtpnXx.gridwidth = 4;
				gbc_txtpnXx.insets = new Insets(0, 0, 5, 0);
				gbc_txtpnXx.fill = GridBagConstraints.BOTH;
				gbc_txtpnXx.gridx = 12;
				gbc_txtpnXx.gridy = 2;
				panel.add(txtpnXx, gbc_txtpnXx);
			}
			{
				btnGodkend = new JButton("Godkend");
				btnGodkend.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onGodkendClicked();
					}
				});
				btnGodkend.setEnabled(false);
				GridBagConstraints gbc_btnGodkend = new GridBagConstraints();
				gbc_btnGodkend.gridwidth = 2;
				gbc_btnGodkend.insets = new Insets(0, 0, 5, 5);
				gbc_btnGodkend.gridx = 12;
				gbc_btnGodkend.gridy = 3;
				panel.add(btnGodkend, gbc_btnGodkend);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okClicked();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Afbryd");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						afbrydClicked();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		init();
	}

	protected void onGodkendClicked() {
		Pincode pn = new Pincode(customer);
		pn.setVisible(true);
		okButton.setEnabled(false);
		cancelButton.setEnabled(false);
		btnGodkend.setEnabled(false);
		btnNewButton_1.setVisible(false);
		btnNewButton.setVisible(false);
	}

	protected void onAddClicked() {
		customer = list.getSelectedValue();
		String kontoNr = customer.getCustomerNumber();
		txtpnXx.setText("Konto nr: " + kontoNr);
		customerSelected = true;
		btnGodkend.setEnabled(customerSelected);
	}

	protected void onSearchClicked() {
		String input = txtinputField.getText().toLowerCase();
		Customer c = new CustomerController().findCustomerByPhone(input);
		DefaultListModel<Customer> dlm = new DefaultListModel<>(); 
		if (c != null) {
			dlm.addElement(c);
		}
		list.setModel(dlm);
		
	}

	protected void okClicked() {
		super.setVisible(false);
	}

	protected void afbrydClicked() {
		super.setVisible(false);
		super.dispose();
	}

	private void init() {
		list.setCellRenderer(new CustomerListCellRenderer());
		displayMembers();
	}

	private void displayMembers() {
		CustomerContainer cc = CustomerContainer.getInstance();
		DefaultListModel<Customer> dlm = new DefaultListModel<>();
		List<Customer> container = cc.getContainerWithEveryCustomer();
		dlm.addAll(container);
		list.setModel(dlm);
	}
	public void enableButtons(boolean b) {
		if (b) {
			okButton.setEnabled(true);
			cancelButton.setEnabled(true);
			btnGodkend.setEnabled(true);
			btnNewButton_1.setVisible(true);
			btnNewButton.setVisible(true);
		} else {
			okButton.setEnabled(true);
			cancelButton.setEnabled(true);
			btnGodkend.setEnabled(true);
			btnNewButton_1.setVisible(true);
			btnNewButton.setVisible(true);
			super.setVisible(false);
			JOptionPane.showMessageDialog(this, "Kontoen blev tilføjet");
			TimberSale ts = TimberSale.getTS();
			ts.setVisible(true);
			ts.setCustomer(customer);
		}
	}
}
