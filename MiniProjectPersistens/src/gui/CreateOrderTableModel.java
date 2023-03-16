package gui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import model.*;

public class CreateOrderTableModel extends AbstractTableModel {

	private static final String[] COL_NAMES = { "Qty", "Name", "Barcode", "Cost price", "Sales price", "Total" };
	private List<SaleOrderLine> data;

	public CreateOrderTableModel(List<SaleOrderLine> ol) {
		this.data = ol;
		if (this.data == null) {
			this.data = new ArrayList<>();
		}

	}

	@Override
	public String getColumnName(int col) {
		return COL_NAMES[col];
	}

	@Override
	public int getRowCount() {

		return data.size();
	}

	@Override
	public int getColumnCount() {
		return COL_NAMES.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		SaleOrderLine sol = data.get(rowIndex);
		String res = "";
		switch (columnIndex) {
		case 0:
			res = Integer.toString(sol.getQuantity());
			break;
		case 1:
			res = sol.getProduct().getName();
			break;
		case 2:
			res = sol.getProduct().getBarcode();
			break;
		case 3:
			res = Double.toString(sol.getProduct().getPurchasePrice());
			break;
		case 4:
			res = Double.toString(sol.getProduct().getSalesPrice().getPrice());
			break;
		case 5:
			res = Double.toString(sol.getSubTotal());
			break;
		default:
			res = "<UNKOWN " + columnIndex + ">";
		}
		return res;
	}

	public SaleOrderLine getDataAt(int rowIndex) {
		return data.get(rowIndex);
	}

	public void setData(List<SaleOrderLine> data) {
		this.data = data;
		super.fireTableDataChanged();
	}

}
