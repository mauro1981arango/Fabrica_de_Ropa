package Vista;

import java.awt.Color;

public class frmCliente extends javax.swing.JFrame {

    public frmCliente() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JPanel();
        LblNombres = new javax.swing.JLabel();
        LblApellidos = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        LblDireccion = new javax.swing.JLabel();
        CbxCiudad = new javax.swing.JComboBox<>();
        LblCiudad = new javax.swing.JLabel();
        TxDireccion = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        TxtNombres = new javax.swing.JTextField();
        TxtIdCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        CbxIdCiudad = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TxtDireccion.setBackground(new java.awt.Color(25, 4, 25));
        TxtDireccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblNombres.setForeground(new java.awt.Color(198, 249, 249));
        LblNombres.setText("Nombres");
        TxtDireccion.add(LblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        LblApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblApellidos.setForeground(new java.awt.Color(198, 249, 249));
        LblApellidos.setText("Apellidos");
        TxtDireccion.add(LblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, -1));

        LblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblTelefono.setForeground(new java.awt.Color(198, 249, 249));
        LblTelefono.setText("Telefono");
        TxtDireccion.add(LblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        LblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblDireccion.setForeground(new java.awt.Color(198, 249, 249));
        LblDireccion.setText("Direccion");
        TxtDireccion.add(LblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        CbxCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(CbxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 270, -1));

        LblCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblCiudad.setForeground(new java.awt.Color(198, 249, 249));
        LblCiudad.setText("Ciudad");
        TxtDireccion.add(LblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, -1));

        TxDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(TxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 270, -1));

        TxtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, -1));

        TxtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(TxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 270, -1));

        TxtNombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(TxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 270, -1));

        TxtIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(TxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, -1));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TblClientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TblClientes.setAlignmentX(0.9F);
        TblClientes.setAlignmentY(0.9F);
        TblClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TblClientes.setGridColor(new java.awt.Color(187, 165, 165));
        TblClientes.setMaximumSize(new java.awt.Dimension(5, 3));
        TblClientes.setMinimumSize(new java.awt.Dimension(5, 3));
        TblClientes.setRowHeight(25);
        TblClientes.setRowMargin(0);
        TblClientes.setSelectionBackground(new java.awt.Color(153, 255, 102));
        TblClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TblClientes.getTableHeader().setResizingAllowed(false);
        TblClientes.getTableHeader().setReorderingAllowed(false);
        TblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TblClientesMousePressed(evt);
            }
        });
        TblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TblClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TblClientes);

        TxtDireccion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 970, 230));

        BtnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnGuardarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseReleased(evt);
            }
        });
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        TxtDireccion.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        BtnEliminar.setBackground(new java.awt.Color(204, 255, 204));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseReleased(evt);
            }
        });
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        TxtDireccion.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 120, -1));

        BtnModificar.setBackground(new java.awt.Color(204, 255, 204));
        BtnModificar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnModificarMouseReleased(evt);
            }
        });
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        TxtDireccion.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 120, -1));

        BtnLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        TxtDireccion.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 120, -1));

        BtnBuscar.setBackground(new java.awt.Color(204, 255, 102));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        TxtDireccion.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 90, -1));

        CbxIdCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtDireccion.add(CbxIdCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtDireccion.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 230, 30));

        lblMensaje.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("  ");
        TxtDireccion.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 370, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE CLIENTES");
        TxtDireccion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
       
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void TblClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblClientesMousePressed

    }//GEN-LAST:event_TblClientesMousePressed

    private void TblClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblClientesKeyReleased

    }//GEN-LAST:event_TblClientesKeyReleased

    private void BtnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMousePressed
        BtnGuardar.setBackground(Color.CYAN);
    }//GEN-LAST:event_BtnGuardarMousePressed

    private void BtnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseReleased
        BtnGuardar.setBackground(Color.green);
    }//GEN-LAST:event_BtnGuardarMouseReleased

    private void BtnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMousePressed
        BtnEliminar.setBackground(Color.yellow);
    }//GEN-LAST:event_BtnEliminarMousePressed

    private void BtnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseReleased
        BtnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_BtnEliminarMouseReleased

    private void BtnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMousePressed
        BtnModificar.setBackground(Color.green);
    }//GEN-LAST:event_BtnModificarMousePressed

    private void BtnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseReleased
        BtnModificar.setBackground(Color.CYAN);
    }//GEN-LAST:event_BtnModificarMouseReleased

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked

    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void TblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblClientesMouseClicked
        int fila = TblClientes.rowAtPoint(evt.getPoint());
        TxtIdCliente.setText(TblClientes.getValueAt(fila, 0).toString());
        TxtNombres.setText(TblClientes.getValueAt(fila, 1).toString());
        TxtApellidos.setText(TblClientes.getValueAt(fila, 2).toString());
        TxtTelefono.setText(TblClientes.getValueAt(fila, 3).toString());
        TxDireccion.setText(TblClientes.getValueAt(fila, 4).toString());
        CbxIdCiudad.setSelectedItem(TblClientes.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TblClientesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnBuscar;
    public javax.swing.JButton BtnEliminar;
    public javax.swing.JButton BtnGuardar;
    public javax.swing.JButton BtnLimpiar;
    public javax.swing.JButton BtnModificar;
    public javax.swing.JComboBox<String> CbxCiudad;
    public javax.swing.JComboBox<String> CbxIdCiudad;
    private javax.swing.JLabel LblApellidos;
    private javax.swing.JLabel LblCiudad;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblNombres;
    private javax.swing.JLabel LblTelefono;
    public javax.swing.JTable TblClientes;
    public javax.swing.JTextField TxDireccion;
    public javax.swing.JTextField TxtApellidos;
    public static javax.swing.JPanel TxtDireccion;
    public javax.swing.JTextField TxtIdCliente;
    public javax.swing.JTextField TxtNombres;
    public javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblMensaje;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
}
