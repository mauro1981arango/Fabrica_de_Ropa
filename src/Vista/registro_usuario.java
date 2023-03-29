/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.SqlUsuarios;
import Modelo.hash;
import Modelo.Usuarios;
import javax.swing.JOptionPane;

public class registro_usuario extends javax.swing.JFrame {

    public registro_usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtIdTipo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        principal.setBackground(new java.awt.Color(5, 5, 19));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Registro de Usuarios");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Nombre");
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 153));
        jLabel3.setText("Usuario");
        principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setText("Contraseña");
        principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 153));
        jLabel5.setText("<html>Confirmar Contraseña</html>");
        principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 153));
        jLabel6.setText("Correo");
        principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 153));
        jLabel7.setText("Tipo");
        principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, -1));

        txtConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtConfirmarContraseña.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, -1));

        txtIdTipo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtIdTipo.setForeground(new java.awt.Color(0, 51, 51));
        principal.add(txtIdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        principal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();
        //Evaluacion de la contraseña
        String pass = new String(txtContraseña.getPassword());
        String passConfirmar = new String(txtConfirmarContraseña.getPassword());

        //Validacion para que ningún campo de texto del formulario esté vacío.
        if (txtNombre.getText().equals("") || txtUsuario.getText().equals("") || pass.equals("") || passConfirmar.equals("") || txtCorreo.getText().equals("") || txtIdTipo.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");

        } else {

            if (pass.equals(passConfirmar)) {
                if (modSql.existeUsuario(txtUsuario.getText()) == 0) {

                    //Llamado del método validar correo
                    if (modSql.esEmail(txtCorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);
                        mod.setNombre(txtNombre.getText());
                        mod.setUsuario(txtUsuario.getText());
                        mod.setContraseña(nuevoPass);
                        mod.setCorreo(txtCorreo.getText());
                        mod.setIdTipo(1);

                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Usuario Guardado satisfactoriamente!!");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo electrónico no es válido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vaya! algo no salió bien. Inténtalo nuevamente");
            }

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void limpiar() {
        txtNombre.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtConfirmarContraseña.setText("");
        txtCorreo.setText("");
        txtIdTipo.setText("");
    }

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
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel principal;
    public javax.swing.JPasswordField txtConfirmarContraseña;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtIdTipo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
