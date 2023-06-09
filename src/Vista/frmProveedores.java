/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Ciudades;
import Modelo.CuentasBancarias;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class frmProveedores extends javax.swing.JFrame {

    /**
     * Creates new form frmProveedores
     */
    public frmProveedores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      pnlPrincipal = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblProveedores = new javax.swing.JTable();
      txtNitProveedor = new javax.swing.JTextField();
      txtNombreEmpresa = new javax.swing.JTextField();
      txtDireccion = new javax.swing.JTextField();
      txtCorreo = new javax.swing.JTextField();
      txtTelefono = new javax.swing.JTextField();
      txtCuentaBancaria = new javax.swing.JTextField();
      cbxTipoCuenta = new javax.swing.JComboBox<>();
      btnBuscar = new javax.swing.JButton();
      txtBuscar = new javax.swing.JTextField();
      btnGuardar = new javax.swing.JButton();
      btnModificar = new javax.swing.JButton();
      btnEliminar = new javax.swing.JButton();
      btnLimpiar = new javax.swing.JButton();
      cbxNombreCiudad = new javax.swing.JComboBox<>();
      txtIdProveedor = new javax.swing.JTextField();
      btnMostrarId = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      pnlPrincipal.setBackground(new java.awt.Color(29, 43, 51));
      pnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
      pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("NIT PROVEEDOR");
      pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, -1));

      jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("NOMBRE EMPRESA");
      pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

      jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("DIRECCION");
      pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, -1));

      jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setText("CORREO");
      pnlPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, -1));

      jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(255, 255, 255));
      jLabel5.setText("TELEFONO");
      pnlPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, -1));

      jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(255, 255, 255));
      jLabel6.setText("CIUDAD");
      pnlPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, -1));

      jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(255, 255, 255));
      jLabel7.setText("CUENTA");
      pnlPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 60, 20));

      jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
      jLabel8.setForeground(new java.awt.Color(255, 255, 255));
      jLabel8.setText("TIPO");
      pnlPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 40, -1));

      tblProveedores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
      tblProveedores.setAlignmentX(0.9F);
      tblProveedores.setAlignmentY(0.9F);
      tblProveedores.setMaximumSize(new java.awt.Dimension(8, 8));
      tblProveedores.setMinimumSize(new java.awt.Dimension(8, 8));
      tblProveedores.setRowHeight(20);
      tblProveedores.setSelectionBackground(new java.awt.Color(102, 255, 102));
      tblProveedores.setSelectionForeground(new java.awt.Color(0, 0, 0));
      tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblProveedoresMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tblProveedores);

      pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1280, 160));

      txtNitProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtNitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 220, -1));

      txtNombreEmpresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 220, -1));

      txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      txtDireccion.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtDireccionActionPerformed(evt);
         }
      });
      pnlPrincipal.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, -1));

      txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 220, -1));

      txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTelefonoKeyTyped(evt);
         }
      });
      pnlPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, -1));

      txtCuentaBancaria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtCuentaBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, -1));

      cbxTipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      pnlPrincipal.add(cbxTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 220, -1));

      btnBuscar.setBackground(new java.awt.Color(255, 204, 255));
      btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
      btnBuscar.setText("Buscar");
      btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            btnBuscarMousePressed(evt);
         }
      });
      pnlPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 130, -1));

      txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 180, 30));

      btnGuardar.setBackground(new java.awt.Color(186, 208, 163));
      btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
      btnGuardar.setText("Guardar");
      btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            btnGuardarMousePressed(evt);
         }
         public void mouseReleased(java.awt.event.MouseEvent evt) {
            btnGuardarMouseReleased(evt);
         }
      });
      pnlPrincipal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 130, -1));

      btnModificar.setBackground(new java.awt.Color(186, 208, 163));
      btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
      btnModificar.setText("Modificar");
      btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            btnModificarMousePressed(evt);
         }
         public void mouseReleased(java.awt.event.MouseEvent evt) {
            btnModificarMouseReleased(evt);
         }
      });
      pnlPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 130, -1));

      btnEliminar.setBackground(new java.awt.Color(186, 208, 163));
      btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
      btnEliminar.setText("Eliminar");
      btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            btnEliminarMousePressed(evt);
         }
         public void mouseReleased(java.awt.event.MouseEvent evt) {
            btnEliminarMouseReleased(evt);
         }
      });
      pnlPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 130, -1));

      btnLimpiar.setBackground(new java.awt.Color(186, 208, 163));
      btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
      btnLimpiar.setText("Limpiar");
      btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            btnLimpiarMousePressed(evt);
         }
         public void mouseReleased(java.awt.event.MouseEvent evt) {
            btnLimpiarMouseReleased(evt);
         }
      });
      pnlPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, -1));

      cbxNombreCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      pnlPrincipal.add(cbxNombreCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 220, -1));

      txtIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      pnlPrincipal.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));

      btnMostrarId.setText("jButton1");
      btnMostrarId.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnMostrarIdActionPerformed(evt);
         }
      });
      pnlPrincipal.add(btnMostrarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Con esta variable logramos que el campo txtTelefono no reciba letras, sólo números.
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'  )evt.consume();
        //Con esta condición se limita el campo TxtTelefono a recibir tan sólo 10 números.
        if(txtTelefono.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
       btnGuardar.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseReleased
        btnGuardar.setBackground(Color.green);
    }//GEN-LAST:event_btnGuardarMouseReleased

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        btnModificar.setBackground(Color.green);
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
        btnModificar.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnModificarMouseReleased

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        btnEliminar.setBackground(Color.yellow);
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        btnLimpiar.setBackground(Color.orange);
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased
        btnLimpiar.setBackground(Color.white);
    }//GEN-LAST:event_btnLimpiarMouseReleased

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        btnBuscar.setBackground(Color.orange);
    }//GEN-LAST:event_btnBuscarMousePressed

   private void btnMostrarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIdActionPerformed
//        int opcion = cbxNombreCiudad.getSelectedIndex() + 1;
//        JOptionPane.showMessageDialog(null, "Selecionó la opción " + opcion);
//        int Id = cbxNombreCiudad.getItemAt(cbxNombreCiudad.getSelectedIndex()).getIdCiudad();
//        JOptionPane.showMessageDialog(null, "Selecionó la opción " + Id);

   }//GEN-LAST:event_btnMostrarIdActionPerformed

   private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
      int fila = tblProveedores.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(tblProveedores.getValueAt(fila, 0).toString());
        txtNitProveedor.setText(tblProveedores.getValueAt(fila, 1).toString());
        txtNombreEmpresa.setText(tblProveedores.getValueAt(fila, 2).toString());
        txtDireccion.setText(tblProveedores.getValueAt(fila, 3).toString());
        txtCorreo.setText(tblProveedores.getValueAt(fila, 4).toString());
        txtTelefono.setText(tblProveedores.getValueAt(fila, 5).toString());
        cbxNombreCiudad.setSelectedItem(tblProveedores.getValueAt(fila, 6).toString());
        txtCuentaBancaria.setText(tblProveedores.getValueAt(fila, 7).toString());
        cbxTipoCuenta.setSelectedItem(tblProveedores.getValueAt(fila, 8).toString());
   }//GEN-LAST:event_tblProveedoresMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedores().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public javax.swing.JButton btnBuscar;
   public javax.swing.JButton btnEliminar;
   public javax.swing.JButton btnGuardar;
   public javax.swing.JButton btnLimpiar;
   public javax.swing.JButton btnModificar;
   private javax.swing.JButton btnMostrarId;
   public javax.swing.JComboBox<Ciudades> cbxNombreCiudad;
   public javax.swing.JComboBox<CuentasBancarias> cbxTipoCuenta;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JPanel pnlPrincipal;
   public javax.swing.JTable tblProveedores;
   public javax.swing.JTextField txtBuscar;
   public javax.swing.JTextField txtCorreo;
   public javax.swing.JTextField txtCuentaBancaria;
   public javax.swing.JTextField txtDireccion;
   public javax.swing.JTextField txtIdProveedor;
   public javax.swing.JTextField txtNitProveedor;
   public javax.swing.JTextField txtNombreEmpresa;
   public javax.swing.JTextField txtTelefono;
   // End of variables declaration//GEN-END:variables
}
