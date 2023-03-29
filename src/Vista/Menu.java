package Vista;

import Controlador.CtrlClientes;
import Controlador.CtrlFactura;
//import Controlador.CtrlDetalleFactura;
import Controlador.CtrlInventario;
import Controlador.CtrlRecursosHumanos;
import Controlador.CtrlMateriaPrima;
import Controlador.CtrlNomina;
import Controlador.CtrlProveedores;
import Controlador.CtrlRopaTerminada;
import Modelo.ClienteDAO;
import Modelo.Clientes;
import Modelo.ColorCeldaTabla;
import Modelo.ConsultasClientes;
import Modelo.ConsultasDetalleFactura;
import Modelo.ConsultasFactura;
import Modelo.ConsultasInventario;
import Modelo.ConsultasMateriaPrima;
import Modelo.ConsultasNomina;
import Modelo.ConsultasProveedores;
import Modelo.ConsultasRecursosHumanos;
import Modelo.ConsultasRopaTerminada;
import Modelo.DetalleFactura;
import Modelo.Factura;
import Modelo.FacturaDAO;
import Modelo.Inventario;
import Modelo.MateriaPrima;
import Modelo.Nomina;
import Modelo.Proveedores;
import Modelo.RecursosHumanos;
import Modelo.RopaTerminada;
import Modelo.RopaTerminadaDAO;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

   public Menu() {
      initComponents();
      this.setLocationRelativeTo(null);

   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenu();
        clientes = new javax.swing.JMenuItem();
        menuDetalleFactura = new javax.swing.JMenu();
        DetalleFactura = new javax.swing.JMenuItem();
        menuFactura = new javax.swing.JMenu();
        Factura = new javax.swing.JMenuItem();
        menuInventario = new javax.swing.JMenu();
        inventario = new javax.swing.JMenuItem();
        menuMateriaPrima = new javax.swing.JMenu();
        MateriaPrima = new javax.swing.JMenuItem();
        menuNomina = new javax.swing.JMenu();
        nomina = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        proveedores = new javax.swing.JMenuItem();
        menuRH = new javax.swing.JMenu();
        recursosHumanos = new javax.swing.JMenuItem();
        menuRopaTerminada = new javax.swing.JMenu();
        ropa_terminada = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        principal.setBackground(new java.awt.Color(97, 24, 0));

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        barraMenu.setBackground(new java.awt.Color(153, 255, 102));
        barraMenu.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        Archivo.setText("File");
        Archivo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        barraMenu.add(Archivo);

        menuClientes.setText("Clientes");
        menuClientes.setFocusPainted(true);
        menuClientes.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        menuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientesMouseClicked(evt);
            }
        });
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });

        clientes.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        clientes.setText(" Formulario Clientes");
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        menuClientes.add(clientes);

        barraMenu.add(menuClientes);

        menuDetalleFactura.setText("Detalle Factura");
        menuDetalleFactura.setFocusPainted(true);
        menuDetalleFactura.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        DetalleFactura.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        DetalleFactura.setText("Detalle Factura");
        DetalleFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalleFacturaActionPerformed(evt);
            }
        });
        menuDetalleFactura.add(DetalleFactura);

        barraMenu.add(menuDetalleFactura);

        menuFactura.setText("Factura");
        menuFactura.setFocusPainted(true);
        menuFactura.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        menuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFacturaActionPerformed(evt);
            }
        });

        Factura.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        Factura.setText("Factura");
        Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaActionPerformed(evt);
            }
        });
        menuFactura.add(Factura);

        barraMenu.add(menuFactura);

        menuInventario.setText("Inventario");
        menuInventario.setFocusPainted(true);
        menuInventario.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        inventario.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        menuInventario.add(inventario);

        barraMenu.add(menuInventario);

        menuMateriaPrima.setText("Materia Prima");
        menuMateriaPrima.setFocusPainted(true);
        menuMateriaPrima.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        menuMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaPrimaActionPerformed(evt);
            }
        });

        MateriaPrima.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        MateriaPrima.setText("Materia Prima");
        MateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaPrimaActionPerformed(evt);
            }
        });
        menuMateriaPrima.add(MateriaPrima);

        barraMenu.add(menuMateriaPrima);

        menuNomina.setText("Nómina");
        menuNomina.setFocusPainted(true);
        menuNomina.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        nomina.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        nomina.setText(" Nómina");
        nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominaActionPerformed(evt);
            }
        });
        menuNomina.add(nomina);

        barraMenu.add(menuNomina);

        menuProveedores.setText("Proveedores");
        menuProveedores.setFocusPainted(true);
        menuProveedores.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        proveedores.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        proveedores.setText("Proveedor");
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        menuProveedores.add(proveedores);

        barraMenu.add(menuProveedores);

        menuRH.setText("RRHH");
        menuRH.setFocusPainted(true);
        menuRH.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        recursosHumanos.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        recursosHumanos.setText("Recursos Humanos");
        recursosHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursosHumanosActionPerformed(evt);
            }
        });
        menuRH.add(recursosHumanos);

        barraMenu.add(menuRH);

        menuRopaTerminada.setText("Productos");
        menuRopaTerminada.setFocusPainted(true);
        menuRopaTerminada.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        ropa_terminada.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        ropa_terminada.setText("Venta Productos");
        ropa_terminada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ropa_terminadaActionPerformed(evt);
            }
        });
        menuRopaTerminada.add(ropa_terminada);

        barraMenu.add(menuRopaTerminada);

        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFocusPainted(true);
        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N

        usuarios.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        usuarios.setText("Administrador");
        menuUsuarios.add(usuarios);

        barraMenu.add(menuUsuarios);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseClicked


    }//GEN-LAST:event_menuClientesMouseClicked

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed

    }//GEN-LAST:event_menuClientesActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
       frmCliente vista_cliente = new frmCliente();
       Clientes clente = new Clientes();
       ConsultasClientes cli_consultas = new ConsultasClientes();
       ColorCeldaTabla color = new ColorCeldaTabla();
       CtrlClientes controlador_cliente = new CtrlClientes(clente, cli_consultas, vista_cliente, color);
       controlador_cliente.iniciar();
       vista_cliente.setVisible(true);


    }//GEN-LAST:event_clientesActionPerformed

    private void recursosHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursosHumanosActionPerformed
       RecursosHumanos recursos_humanos_model = new RecursosHumanos();
       ConsultasRecursosHumanos recursos_humanos_consultas = new ConsultasRecursosHumanos();
       frmRecursosHumanos vista_recursos_humanos = new frmRecursosHumanos();

       CtrlRecursosHumanos rh_controlador = new CtrlRecursosHumanos(recursos_humanos_model, recursos_humanos_consultas, vista_recursos_humanos);
       rh_controlador.iniciar();
       vista_recursos_humanos.setVisible(true);
    }//GEN-LAST:event_recursosHumanosActionPerformed

    private void DetalleFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalleFacturaActionPerformed
//        frmDetalleFactura vista_detalle = new frmDetalleFactura();
//        DetalleFactura modelDetalle = new DetalleFactura();
//        ConsultasDetalleFactura modelConsultaDetalle = new ConsultasDetalleFactura();
//        //CtrlDetalleFactura controlador_detalle_factura = new CtrlDetalleFactura(modelDetalle, modelConsultaDetalle, vista_detalle);
//        controlador_detalle_factura.iniciar();
//        vista_detalle.setVisible(true);


    }//GEN-LAST:event_DetalleFacturaActionPerformed

    private void FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaActionPerformed
       frmFactura vistaFactura = new frmFactura();
       Factura factura = new Factura();
       FacturaDAO fDAO = new FacturaDAO();
       Clientes cliente = new Clientes();
       ClienteDAO cliDao = new ClienteDAO();
       RopaTerminada pro = new RopaTerminada();
       RopaTerminadaDAO proDAO = new RopaTerminadaDAO();
       DetalleFactura df = new DetalleFactura();
       DefaultTableModel modelo = new DefaultTableModel();
       CtrlFactura controlador_factura = new CtrlFactura(vistaFactura, factura, fDAO, df, modelo, cliente, cliDao, pro, proDAO);
       vistaFactura.setVisible(true);
       controlador_factura.iniciar();
       

    }//GEN-LAST:event_FacturaActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
       frmInventario vista_inventario = new frmInventario();
       Inventario modelinventario = new Inventario();
       ConsultasInventario inventario_consultas = new ConsultasInventario();
       CtrlInventario controlador_inventaro = new CtrlInventario(modelinventario, inventario_consultas, vista_inventario);
       controlador_inventaro.iniciar();
       vista_inventario.setVisible(true);
    }//GEN-LAST:event_inventarioActionPerformed

    private void MateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaPrimaActionPerformed
       frmMateriaPrima vista_material = new frmMateriaPrima();
       MateriaPrima modeloMaterial = new MateriaPrima();
       ConsultasMateriaPrima consultasMateriales = new ConsultasMateriaPrima();
       CtrlMateriaPrima controlador_materia_prima = new CtrlMateriaPrima(modeloMaterial, consultasMateriales, vista_material);
       controlador_materia_prima.iniciar();
       vista_material.setVisible(true);

    }//GEN-LAST:event_MateriaPrimaActionPerformed

    private void nominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominaActionPerformed
       frmNomina vista_pagos = new frmNomina();
       Nomina modelPago = new Nomina();
       ConsultasNomina consultasPago = new ConsultasNomina();
       CtrlNomina controlador_pagos = new CtrlNomina(modelPago, consultasPago, vista_pagos);
       controlador_pagos.iniciar();
       vista_pagos.setVisible(true);
    }//GEN-LAST:event_nominaActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
       Proveedores modelo_proveedor = new Proveedores();
       ConsultasProveedores consultas_proveedor = new ConsultasProveedores();
       frmProveedores vista_proveedor = new frmProveedores();
       CtrlProveedores controlador_proveedor = new CtrlProveedores(modelo_proveedor, consultas_proveedor, vista_proveedor);
       controlador_proveedor.iniciar();
       vista_proveedor.setVisible(true);

    }//GEN-LAST:event_proveedoresActionPerformed

    private void ropa_terminadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ropa_terminadaActionPerformed
       frmRopaTerminada vista_productos = new frmRopaTerminada();
       RopaTerminada modelo_ropa = new RopaTerminada();
       ConsultasRopaTerminada consultas_ropa_terminada = new ConsultasRopaTerminada();
       CtrlRopaTerminada controlador_productos = new CtrlRopaTerminada(modelo_ropa, consultas_ropa_terminada, vista_productos);
       controlador_productos.iniciar();
       vista_productos.setVisible(true);

    }//GEN-LAST:event_ropa_terminadaActionPerformed

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked

    }//GEN-LAST:event_clientesMouseClicked

    private void menuMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaPrimaActionPerformed

    }//GEN-LAST:event_menuMateriaPrimaActionPerformed

    private void menuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFacturaActionPerformed

    }//GEN-LAST:event_menuFacturaActionPerformed

   public static void main(String args[]) {

      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Menu().setVisible(true);

         }
      });
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Archivo;
    public javax.swing.JMenuItem DetalleFactura;
    public javax.swing.JMenuItem Factura;
    public javax.swing.JMenuItem MateriaPrima;
    public javax.swing.JMenuBar barraMenu;
    public javax.swing.JMenuItem clientes;
    public javax.swing.JMenuItem inventario;
    public javax.swing.JMenu menuClientes;
    public javax.swing.JMenu menuDetalleFactura;
    public javax.swing.JMenu menuFactura;
    public javax.swing.JMenu menuInventario;
    public javax.swing.JMenu menuMateriaPrima;
    public javax.swing.JMenu menuNomina;
    public javax.swing.JMenu menuProveedores;
    public javax.swing.JMenu menuRH;
    public javax.swing.JMenu menuRopaTerminada;
    public javax.swing.JMenu menuUsuarios;
    public javax.swing.JMenuItem nomina;
    private javax.swing.JPanel principal;
    public javax.swing.JMenuItem proveedores;
    public javax.swing.JMenuItem recursosHumanos;
    public javax.swing.JMenuItem ropa_terminada;
    public javax.swing.JMenuItem usuarios;
    // End of variables declaration//GEN-END:variables

}
