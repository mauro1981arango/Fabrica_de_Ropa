package Vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class frmRecursosHumanos extends javax.swing.JFrame {

    public frmRecursosHumanos() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelControles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        TxtNombres = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        CbxIdRH = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        CbxIdSalario = new javax.swing.JComboBox<>();
        TxtNroCuenta = new javax.swing.JTextField();
        jDateCFechaNacimiento = new com.toedter.calendar.JDateChooser();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRecursosHumanos = new javax.swing.JTable();
        cbxTipoCuenta = new javax.swing.JComboBox<>();
        txtIdRhumanos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelControles.setBackground(new java.awt.Color(22, 2, 22));
        jPanelControles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Cédula");
        jPanelControles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 65, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Nombres");
        jPanelControles.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 88, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Apellidos");
        jPanelControles.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 88, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Fecha de nacimiento");
        jPanelControles.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 179, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Tipo de Sangre");
        jPanelControles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 136, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Teléfono");
        jPanelControles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 86, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Dirección");
        jPanelControles.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 89, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("Correo");
        jPanelControles.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 76, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 153));
        jLabel9.setText("Salario");
        jPanelControles.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 65, -1));

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 153));
        jLabel11.setText("Tipo de Cuenta");
        jPanelControles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 136, -1));

        jLabel12.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 153));
        jLabel12.setText("Nro Cuenta");
        jPanelControles.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 103, -1));

        txtCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCedula.setNextFocusableComponent(TxtNombres);
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanelControles.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, -1));

        TxtNombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtNombres.setNextFocusableComponent(TxtApellidos);
        TxtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombresKeyTyped(evt);
            }
        });
        jPanelControles.add(TxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 270, -1));

        TxtApellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtApellidos.setNextFocusableComponent(jDateCFechaNacimiento);
        TxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidosActionPerformed(evt);
            }
        });
        TxtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidosKeyTyped(evt);
            }
        });
        jPanelControles.add(TxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, -1));

        CbxIdRH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CbxIdRH.setNextFocusableComponent(txtTelefono);
        jPanelControles.add(CbxIdRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, -1));

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefono.setNextFocusableComponent(TxtDireccion);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanelControles.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, -1));

        TxtDireccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtDireccion.setNextFocusableComponent(TxtCorreo);
        TxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDireccionKeyTyped(evt);
            }
        });
        jPanelControles.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, -1));

        TxtCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });
        jPanelControles.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 270, -1));

        CbxIdSalario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanelControles.add(CbxIdSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 270, -1));

        TxtNroCuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanelControles.add(TxtNroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 270, -1));

        jDateCFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jDateCFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDateCFechaNacimiento.setNextFocusableComponent(CbxIdRH);
        jDateCFechaNacimiento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateCFechaNacimientoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelControles.add(jDateCFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 270, 30));

        BtnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        BtnGuardar.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanelControles.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 150, -1));

        BtnEliminar.setBackground(new java.awt.Color(204, 255, 204));
        BtnEliminar.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseReleased(evt);
            }
        });
        jPanelControles.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 150, -1));

        BtnModificar.setBackground(new java.awt.Color(204, 255, 204));
        BtnModificar.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
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
        jPanelControles.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 150, -1));

        BtnLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        BtnLimpiar.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        jPanelControles.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 150, -1));

        BtnBuscar.setBackground(new java.awt.Color(255, 204, 102));
        BtnBuscar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseReleased(evt);
            }
        });
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanelControles.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        TxtBuscar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanelControles.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 180, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PERSONAL DE RECURSSOS HUMANOS");
        jPanelControles.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jPanelTabla.setBackground(new java.awt.Color(0, 51, 51));
        jPanelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblRecursosHumanos.setBorder(new javax.swing.border.MatteBorder(null));
        TblRecursosHumanos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TblRecursosHumanos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TblRecursosHumanos.setRowHeight(25);
        TblRecursosHumanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblRecursosHumanosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblRecursosHumanos);

        jPanelTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 160));

        jPanelControles.add(jPanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1550, 160));

        cbxTipoCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanelControles.add(cbxTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 280, 30));

        txtIdRhumanos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelControles.add(txtIdRhumanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, 1688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseReleased
        BtnBuscar.setBackground(Color.orange);
    }//GEN-LAST:event_BtnBuscarMouseReleased

    private void BtnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMousePressed
        BtnBuscar.setBackground(Color.blue);
    }//GEN-LAST:event_BtnBuscarMousePressed

    private void BtnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseReleased
        BtnModificar.setBackground(Color.CYAN);
    }//GEN-LAST:event_BtnModificarMouseReleased

    private void BtnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMousePressed
        BtnModificar.setBackground(Color.green);
    }//GEN-LAST:event_BtnModificarMousePressed

    private void BtnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseReleased
        BtnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_BtnEliminarMouseReleased

    private void BtnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMousePressed
        BtnEliminar.setBackground(Color.yellow);
    }//GEN-LAST:event_BtnEliminarMousePressed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseReleased
        BtnGuardar.setBackground(Color.green);
    }//GEN-LAST:event_BtnGuardarMouseReleased

    private void BtnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMousePressed
        BtnGuardar.setBackground(Color.CYAN);
    }//GEN-LAST:event_BtnGuardarMousePressed

    private void jDateCFechaNacimientoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateCFechaNacimientoAncestorAdded

    }//GEN-LAST:event_jDateCFechaNacimientoAncestorAdded

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped

    }//GEN-LAST:event_TxtCorreoKeyTyped

    private void TxtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDireccionKeyTyped

    }//GEN-LAST:event_TxtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Con esta variable logramos que el campo TxtTelefono no reciba letras, sólo números.
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        //Con esta condición se limita el campo TxtTelefono a recibir tan sólo 10 números.
        if (txtTelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void TxtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidosKeyTyped
        //Con esta variable logramos que el campo TxtApellidos no reciba números, sólo las letras d la a a la z..
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && c != KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_TxtApellidosKeyTyped

    private void TxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidosActionPerformed

    private void TxtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombresKeyTyped
        //Con esta variable logramos que el campo TxtNombres no reciba números, sólo las letras d la a a la z..
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && c != KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_TxtNombresKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        //Con esta variable logramos que el campo TxtIdCedula no reciba letras, sólo números.
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        //Con esta condición se limita el campo TxtIdCedula a recibir tan sólo 10 números.
        if (txtCedula.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

   private void TblRecursosHumanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblRecursosHumanosMouseClicked
       int fila = TblRecursosHumanos.rowAtPoint(evt.getPoint());
       txtIdRhumanos.setText(TblRecursosHumanos.getValueAt(fila, 0).toString());
       txtCedula.setText(TblRecursosHumanos.getValueAt(fila, 1).toString());
       TxtNombres.setText(TblRecursosHumanos.getValueAt(fila, 2).toString());
       TxtApellidos.setText(TblRecursosHumanos.getValueAt(fila, 3).toString());
       String IsFecha = String.valueOf(TblRecursosHumanos.getValueAt(TblRecursosHumanos.getSelectedRow(), 4));
       SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
       java.util.Date fecha;
       try {
           fecha = (java.util.Date) formatoFecha.parse(IsFecha);
           jDateCFechaNacimiento.setDate(fecha);
       } catch (ParseException e) {
           System.err.println("Error " + e.toString());
       }
       CbxIdRH.setSelectedItem(TblRecursosHumanos.getValueAt(fila, 5).toString());
       txtTelefono.setText(TblRecursosHumanos.getValueAt(fila, 6).toString());
       TxtDireccion.setText(TblRecursosHumanos.getValueAt(fila, 7).toString());
       TxtCorreo.setText(TblRecursosHumanos.getValueAt(fila, 8).toString());
       CbxIdSalario.setSelectedItem(TblRecursosHumanos.getValueAt(fila, 9).toString());
       cbxTipoCuenta.setSelectedItem(TblRecursosHumanos.getValueAt(fila, 10).toString());
       TxtNroCuenta.setText(TblRecursosHumanos.getValueAt(fila, 11).toString());

   }//GEN-LAST:event_TblRecursosHumanosMouseClicked

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

    }//GEN-LAST:event_BtnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRecursosHumanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecursosHumanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecursosHumanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecursosHumanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecursosHumanos().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnBuscar;
    public javax.swing.JButton BtnEliminar;
    public javax.swing.JButton BtnGuardar;
    public javax.swing.JButton BtnLimpiar;
    public javax.swing.JButton BtnModificar;
    public javax.swing.JComboBox<String> CbxIdRH;
    public javax.swing.JComboBox<String> CbxIdSalario;
    public javax.swing.JTable TblRecursosHumanos;
    public javax.swing.JTextField TxtApellidos;
    public javax.swing.JTextField TxtBuscar;
    public javax.swing.JTextField TxtCorreo;
    public javax.swing.JTextField TxtDireccion;
    public javax.swing.JTextField TxtNombres;
    public javax.swing.JTextField TxtNroCuenta;
    public javax.swing.JComboBox<String> cbxTipoCuenta;
    public com.toedter.calendar.JDateChooser jDateCFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelControles;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtIdRhumanos;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
