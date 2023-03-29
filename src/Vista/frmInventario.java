package Vista;

import Modelo.Proveedores;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmInventario extends javax.swing.JFrame {

    public frmInventario() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jDateFechaCompra = new com.toedter.calendar.JDateChooser();
        jDateFechaMantenimiento = new com.toedter.calendar.JDateChooser();
        cbxCategoriaMaterial = new javax.swing.JComboBox<>();
        cbxNitProveedor = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEiminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtIdInventario = new javax.swing.JTextField();
        cbxIdMateriaPrima = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblInventario = new javax.swing.JTable();

        jLabel5.setText("jLabel5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFormulario.setBackground(new java.awt.Color(0, 51, 51));
        pnlFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Nombre");
        pnlFormulario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 75, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Fecba de Compra");
        pnlFormulario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 151, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Fecha de Mantenimiento");
        pnlFormulario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 218, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Refeencia");
        pnlFormulario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 109, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Empresa");
        pnlFormulario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 84, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Tipo");
        pnlFormulario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 41, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, -1));

        jDateFechaCompra.setDateFormatString("yyyy-MM-dd");
        jDateFechaCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(jDateFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 30));

        jDateFechaMantenimiento.setDateFormatString("yyyy-MM-dd");
        jDateFechaMantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(jDateFechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 30));

        cbxCategoriaMaterial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(cbxCategoriaMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 229, -1));

        cbxNitProveedor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pnlFormulario.add(cbxNitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 30));

        btnBuscar.setBackground(new java.awt.Color(153, 204, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        pnlFormulario.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 130, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlFormulario.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 180, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 51, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        pnlFormulario.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 130, -1));

        btnEiminar.setBackground(new java.awt.Color(0, 51, 0));
        btnEiminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnEiminar.setText("Eliminar");
        btnEiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEiminarActionPerformed(evt);
            }
        });
        pnlFormulario.add(btnEiminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 130, -1));

        btnModificar.setBackground(new java.awt.Color(0, 51, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlFormulario.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 130, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        pnlFormulario.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 130, -1));

        txtIdInventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(txtIdInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 125, -1));

        cbxIdMateriaPrima.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFormulario.add(cbxIdMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TABLA DE REGISTROS PRODUCTOS INVENTARIO");
        pnlFormulario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 410, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO DE INVENTARIO");
        pnlFormulario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 240, -1));

        getContentPane().add(pnlFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 420));

        TblInventario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInventarioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TblInventario);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 920, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEiminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEiminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void TblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInventarioMouseClicked
        int fila = TblInventario.rowAtPoint(evt.getPoint());
        txtIdInventario.setText(TblInventario.getValueAt(fila, 0).toString());
        txtNombre.setText(TblInventario.getValueAt(fila, 1).toString());
        String IsFecha = String.valueOf(TblInventario.getValueAt(TblInventario.getSelectedRow(), 2));
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha;
        try {
            fecha = (java.util.Date) formatoFecha.parse(IsFecha);
            jDateFechaCompra.setDate(fecha);
        } catch (ParseException e) {
            System.err.println("Error" + e.toString());
        }

        IsFecha = String.valueOf(TblInventario.getValueAt(TblInventario.getSelectedRow(), 3));
        formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = (java.util.Date) formatoFecha.parse(IsFecha);
            jDateFechaMantenimiento.setDate(fecha);
        } catch (ParseException e) {
            System.err.println("Error" + e.toString());
        }
        cbxIdMateriaPrima.setSelectedItem(TblInventario.getValueAt(fila, 4).toString());
        cbxNitProveedor.setSelectedItem(TblInventario.getValueAt(fila, 5).toString());
        cbxCategoriaMaterial.setSelectedItem(TblInventario.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_TblInventarioMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TblInventario;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEiminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> cbxCategoriaMaterial;
    public javax.swing.JComboBox<Object> cbxIdMateriaPrima;
    public javax.swing.JComboBox<Proveedores> cbxNitProveedor;
    public com.toedter.calendar.JDateChooser jDateFechaCompra;
    public com.toedter.calendar.JDateChooser jDateFechaMantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pnlFormulario;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtIdInventario;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
