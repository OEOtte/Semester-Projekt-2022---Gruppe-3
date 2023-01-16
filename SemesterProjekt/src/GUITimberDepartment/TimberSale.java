package GUITimberDepartment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimberSale extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the timber window
	 */
	public static void main(String[] args) {
		try {
			TimberSale dialog = new TimberSale();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TimberSale() {
		setTitle("Timber salg");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel øst = new JPanel();
			contentPanel.add(øst, BorderLayout.EAST);
			GridBagLayout gbl_øst = new GridBagLayout();
			gbl_øst.columnWidths = new int[]{0, 0};
			gbl_øst.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_øst.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_øst.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			øst.setLayout(gbl_øst);
			{
				JButton btnNyOrdre = new JButton("Ny Ordre");
				btnNyOrdre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nyOrdreClicked();
					}
				});
				GridBagConstraints gbc_btnNyOrdre = new GridBagConstraints();
				gbc_btnNyOrdre.insets = new Insets(0, 0, 5, 0);
				gbc_btnNyOrdre.gridx = 0;
				gbc_btnNyOrdre.gridy = 0;
				øst.add(btnNyOrdre, gbc_btnNyOrdre);
			}
			{
				JButton btnFindKonto = new JButton("Find Konto");
				btnFindKonto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						findKontoClicked();
					}
				});
				GridBagConstraints gbc_btnFindKonto = new GridBagConstraints();
				gbc_btnFindKonto.insets = new Insets(0, 0, 5, 0);
				gbc_btnFindKonto.gridx = 0;
				gbc_btnFindKonto.gridy = 1;
				øst.add(btnFindKonto, gbc_btnFindKonto);
			}
		}
		{
			JPanel nord = new JPanel();
			contentPanel.add(nord, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("Salg");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				nord.add(lblNewLabel);
			}
		}
		{
			JPanel vest = new JPanel();
			contentPanel.add(vest, BorderLayout.WEST);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				JLabel lblNewLabel_1 = new JLabel("Ordre");
				scrollPane.setColumnHeaderView(lblNewLabel_1);
			}
			{
				JList list = new JList();
				scrollPane.setViewportView(list);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnBetalKonto = new JButton("Betal Konto");
				btnBetalKonto.setActionCommand("OK");
				buttonPane.add(btnBetalKonto);
				getRootPane().setDefaultButton(btnBetalKonto);
			}
			{
				JButton btnAfbryd = new JButton("Afbryd");
				btnAfbryd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					afbrydClicked();
					}
				});
				btnAfbryd.setActionCommand("Cancel");
				buttonPane.add(btnAfbryd);
			}
		}
		init();
	}

	protected void findKontoClicked() {
		FindKonto findKonto = new FindKonto();
		findKonto.setVisible(true);
	}

	protected void nyOrdreClicked() {
		NyOrdre nyOrdre = new NyOrdre();
		nyOrdre.setVisible(true);
		
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

	protected void afbrydClicked() {
		super.setVisible(false);
		super.dispose();
		GUI gui = new GUI().getFrame();
		gui.setVisible(true);
	}

}
