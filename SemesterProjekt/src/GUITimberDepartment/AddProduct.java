package GUITimberDepartment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ProductController;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AddProduct extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtinputField;
	private JList<Product> list;
	private JList<Product> orderList;
	private ProductController pc;
	private JButton okButton;
	private Product p2;
	private DefaultListModel<Product> dlmV2 = new DefaultListModel<>();
	private JTextField txtAddTextBox;
	private int methodCounter = 0;
	private String helper = "";
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			AddProduct dialog = new AddProduct();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public AddProduct(JList<Product> listv2) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Produkt");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 5;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 7;
			gbc_scrollPane.gridwidth = 8;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				list = new JList<>();
				scrollPane.setViewportView(list);
			}
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Søg efter produktnavn");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.gridwidth = 6;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel_1.gridx = 8;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			txtinputField = new JTextField();
			GridBagConstraints gbc_txtinputField = new GridBagConstraints();
			gbc_txtinputField.gridwidth = 4;
			gbc_txtinputField.insets = new Insets(0, 0, 5, 5);
			gbc_txtinputField.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtinputField.gridx = 9;
			gbc_txtinputField.gridy = 2;
			contentPanel.add(txtinputField, gbc_txtinputField);
			txtinputField.setColumns(10);
		}
		{
			JButton btnNewButton_1 = new JButton("Søg");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					søgClicked();
				}
			});
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_1.gridx = 10;
			gbc_btnNewButton_1.gridy = 3;
			contentPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		}
		{
			JButton btnNewButton = new JButton("Tilføj produkt");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					onAddClicked();
				}
			});
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 10;
			gbc_btnNewButton.gridy = 4;
			contentPanel.add(btnNewButton, gbc_btnNewButton);
		}
		{
			txtAddTextBox = new JTextField();
			txtAddTextBox.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_txtAddTextBox = new GridBagConstraints();
			gbc_txtAddTextBox.gridwidth = 4;
			gbc_txtAddTextBox.insets = new Insets(0, 0, 5, 0);
			gbc_txtAddTextBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtAddTextBox.gridx = 9;
			gbc_txtAddTextBox.gridy = 6;
			contentPanel.add(txtAddTextBox, gbc_txtAddTextBox);
			txtAddTextBox.setColumns(10);
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
				JButton cancelButton = new JButton("Afbryd");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						afbrydClicked();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		init(listv2);
	}
	protected void onAddClicked() {
		p2 = list.getSelectedValue();
		String name = list.getSelectedValue().getName();
		boolean temp = false;
		if (methodCounter > 0) {
			if (!helper.equals(name)) {
				methodCounter = 0;
			} else {
				name = helper;
				temp = true;
			}
		}
		
		dlmV2.addElement(p2);
		txtAddTextBox.setText("Tilføjede: '" + name + (temp ? "(" + (methodCounter+1) + ")'" : "'"));
		methodCounter++;
		helper = name;
		System.out.println(methodCounter);
	}

	// Finds specific product
	protected void søgClicked() {
		String input = txtinputField.getText().toLowerCase();
		Product p = pc.identifyProduct(null, input);
		DefaultListModel<Product> dlm = new DefaultListModel<>(); 
		if (p != null) {
			dlm.addElement(p);
		}
		list.setModel(dlm);
	}

	protected void okClicked() {
		super.setVisible(false);
		restartTS();
		super.dispose();
	}

	private void init(JList<Product> lst) {
		pc = new ProductController();
		list.setCellRenderer(new ProductListCellRenderer());
		orderList = lst;
		displayProducts();
	}

	private void displayProducts() {
		DefaultListModel<Product> dlm = new DefaultListModel<>();
		ProductContainer pContainer = ProductContainer.getInstance();
		List<Product> container = pContainer.getContainerOfEveryProduct();
		dlm.addAll(container);
		list.setModel(dlm);
	}
	protected void afbrydClicked() {
		super.setVisible(false);
		restartTS();
		super.dispose();
	}
	public JList<Product> getList() {
		orderList.setModel(dlmV2);
		return orderList;
	}
	private void restartTS() {
		TimberSale ts = TimberSale.getTS();
		ts.displayProducts();
	}
}
