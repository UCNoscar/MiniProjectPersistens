package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ctrl.DataAccessException;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SaleOrderGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField totall;
	private JTextField barcode;
	private JTextField phoneInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleOrderGui frame = new SaleOrderGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SaleOrderGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{45, 0};
		gbl_panel.rowHeights = new int[]{13, 0, 0, 0, 0, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblName = new JLabel("Name:");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 0);
		gbc_lblName.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		panel.add(lblName, gbc_lblName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 5;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnFindCustomer = new JButton("Find Customer");
		btnFindCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					findCustomerClicked();
				} catch (DataAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		phoneInput = new JTextField();
		GridBagConstraints gbc_phoneInput = new GridBagConstraints();
		gbc_phoneInput.insets = new Insets(0, 0, 5, 0);
		gbc_phoneInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneInput.gridx = 0;
		gbc_phoneInput.gridy = 6;
		panel.add(phoneInput, gbc_phoneInput);
		phoneInput.setColumns(10);
		GridBagConstraints gbc_btnFindCustomer = new GridBagConstraints();
		gbc_btnFindCustomer.insets = new Insets(0, 0, 5, 0);
		gbc_btnFindCustomer.gridx = 0;
		gbc_btnFindCustomer.gridy = 7;
		panel.add(btnFindCustomer, gbc_btnFindCustomer);
		
		barcode = new JTextField();
		GridBagConstraints gbc_barcode = new GridBagConstraints();
		gbc_barcode.insets = new Insets(0, 0, 5, 0);
		gbc_barcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_barcode.gridx = 0;
		gbc_barcode.gridy = 9;
		panel.add(barcode, gbc_barcode);
		barcode.setColumns(10);
		
		JButton btnAddProduct = new JButton("add product");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnAddProduct = new GridBagConstraints();
		gbc_btnAddProduct.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddProduct.gridx = 0;
		gbc_btnAddProduct.gridy = 10;
		panel.add(btnAddProduct, gbc_btnAddProduct);
		
		JLabel Total = new JLabel("Total:");
		GridBagConstraints gbc_Total = new GridBagConstraints();
		gbc_Total.insets = new Insets(0, 0, 5, 0);
		gbc_Total.gridx = 0;
		gbc_Total.gridy = 12;
		panel.add(Total, gbc_Total);
		
		totall = new JTextField();
		GridBagConstraints gbc_totall = new GridBagConstraints();
		gbc_totall.fill = GridBagConstraints.HORIZONTAL;
		gbc_totall.gridx = 0;
		gbc_totall.gridy = 13;
		panel.add(totall, gbc_totall);
		totall.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelClicked();
			}
		});
		panel_1.add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		panel_1.add(btnConfirm);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

	protected void findCustomerClicked() throws DataAccessException {
		addCustomer addC = new addCustomer();
		addC.setVisible(true);
		
	}

	protected void cancelClicked() {
		this.setVisible(false);
		this.dispose();
	}

}
