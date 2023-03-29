package Modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorCeldaTabla extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (evaluarPar(row)) {
            this.setBackground(Color.orange);
            this.setForeground(Color.black);
        } else {
            this.setBackground(Color.yellow);
            this.setForeground(Color.black);
        }
        return this;
    }

    public boolean evaluarPar(int numero) {

        return numero == 2;

    }
}
