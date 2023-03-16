package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.PersonGroupCtr;
import ctrl.CustomerCtrl;
import ctrl.DataAccessException;
import db.CustomerDB;
import db.CustomerDBIF;
import model.Customer;
import model.Person;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class addCustomer extends JDialog {
	
	private CustomerCtrl cCtrl;
	private JList<Customer> clist;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addCustomer dialog = new addCustomer();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws DataAccessException 
	 */
	public addCustomer() throws DataAccessException {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
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
				JButton btnAdd = new JButton("Add");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnAdd.setActionCommand("OK");
				buttonPane.add(btnAdd);
				getRootPane().setDefaultButton(btnAdd);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelClicked();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		init();
	}
	private void init() {
		try {
			this.cCtrl = new CustomerCtrl();
		} catch (DataAccessException e) {
			JOptionPane.showInternalMessageDialog(null, "Problems initializing the system: " + e.getMessage());
		}
	}

//	private void showCustomer() {
//		Customer c = clist.getSelectedValue();
//		if(c != null) {
//			SaleOrderGui som = new SaleOrderGui();
//			som.setCustomer(c);
//			som.setVisible(true);
//			System.out.println("PersonView should have been closed now according to PersonList");
//
//		}
//	}
	protected void cancelClicked() {
		this.setVisible(false);
	}


	}

