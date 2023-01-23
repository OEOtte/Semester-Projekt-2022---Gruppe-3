package GUITimberDepartment.Cells;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.CustomerRelated.Customer;
import model.ProductRelated.Product;


public class ProductListPriceCellRenderer implements ListCellRenderer<Product> {
	@Override
    public Component getListCellRendererComponent(JList<? extends Product> list, Product value, int index, boolean isSelected,
            boolean cellHasFocus) {
        String res = "" + value.getTotalProductPrice() + " kr";
        return new DefaultListCellRenderer().getListCellRendererComponent(list, res, index, isSelected, cellHasFocus);
    }
}
