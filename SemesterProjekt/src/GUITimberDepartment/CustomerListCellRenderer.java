package GUITimberDepartment;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.CustomerRelated.Customer;

public class CustomerListCellRenderer implements ListCellRenderer<Customer> {
    @Override
    public Component getListCellRendererComponent(JList<? extends Customer> list, Customer value, int index, boolean isSelected,
            boolean cellHasFocus) {
        String res = value.getName() + " | tlf: " 
            + value.getPhone() + 
            " | Group : " + value.getGroup();
        return new DefaultListCellRenderer().getListCellRendererComponent(list, res, index, isSelected, cellHasFocus);
    }
}